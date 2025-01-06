package com.fatiharge.service;


import com.fatiharge.client.rest.openCurrencyApiClient.OpenCurrencyApiClient;


import com.fatiharge.dto.historicalPricesResponse.HistoricalPricesData;

import com.fatiharge.dto.historicalPricesResponse.HistoricalPricesResponse;
import com.fatiharge.dto.historicalPricesResponse.HistoricalPricesMeta;
import com.fatiharge.entity.HistoricalCurrencyPrice;
import com.fatiharge.mapper.HistoricalCurrencyMapper;

import com.fatiharge.repository.HistoricalCurrencyPriceRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@ApplicationScoped
public class HistoricalCurrencyPriceService {


    @Inject
    HistoricalCurrencyPriceRepository historicalCurrencyPriceRepository;

    @RestClient
    @Inject
    OpenCurrencyApiClient openCurrencyApiClient;

    @Inject
    HistoricalCurrencyMapper historicalCurrencyMapper;

    @Transactional
    public HistoricalPricesResponse fetchHistoricalPricesFromDate(
            LocalDate startDate,
            LocalDate endDate
    ) {
        final String baseCurrency = "USD";
        List<LocalDate> allDates = Stream.iterate(startDate, date -> date.plusDays(1))
                .limit(endDate.toEpochDay() - startDate.toEpochDay() + 1)
                .toList();


        List<HistoricalCurrencyPrice> historicalCurrencyPriceList = historicalCurrencyPriceRepository.findByBaseCurrencyAndDate(baseCurrency,
                startDate,
                endDate
        );

        Set<LocalDate> dbDates = historicalCurrencyPriceList.stream().map(hcp -> hcp.date).collect(Collectors.toSet());


        List<LocalDate> missingDates = allDates.stream().filter(date -> !dbDates.contains(date)).toList();

        for (LocalDate date : missingDates) {
            HistoricalCurrencyPrice historicalCurrencyPrice = historicalCurrencyMapper.historicalCurrencyPriceFromApiResponse(
                    openCurrencyApiClient.currencies(String.valueOf(date), baseCurrency));
            historicalCurrencyMapper.setBaseCurrency(historicalCurrencyPrice, baseCurrency);
            historicalCurrencyPrice.persist();
            historicalCurrencyPriceList.add(historicalCurrencyPrice);
        }


        List<HistoricalPricesData> historicalPricesDataList = historicalCurrencyPriceList.stream()
                .map(historicalCurrencyMapper::hcDataFromHistoricalCurrencyPrice)
                .toList();

        HistoricalPricesResponse currenciesResponse = new HistoricalPricesResponse();
        currenciesResponse.historicalPricesDataList = historicalPricesDataList;


        currenciesResponse.historicalPricesMeta = new HistoricalPricesMeta(startDate, endDate, baseCurrency);
        return currenciesResponse;
    }
}
