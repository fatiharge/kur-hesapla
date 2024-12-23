package com.fatiharge.service;


import com.fatiharge.entity.HistoricalCurrencyPrice;

import com.fatiharge.repository.HistoricalCurrencyPriceRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Date;
import java.util.List;

@ApplicationScoped
public class HistoricalCurrencyPriceService {

    @Inject
    HistoricalCurrencyPriceRepository historicalCurrencyPriceRepository;


    public List<HistoricalCurrencyPrice> findByBaseCurrencyAndDate(
            String baseCurrency,
            Date date
    ) {
        return historicalCurrencyPriceRepository.findByBaseCurrencyAndDate(baseCurrency, date);
    }
}
