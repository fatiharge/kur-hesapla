package com.fatiharge.service;

import com.fatiharge.client.rest.currencyApiClient.CurrencyApiClient;
import com.fatiharge.client.rest.currencyApiClient.dto.fetchCurrencyPrice.ApiFetchCurrencyPriceResponse;
import com.fatiharge.entity.CurrencyPrice;
import com.fatiharge.dto.findLatestResponse.FindLatestResponse;
import com.fatiharge.mapper.CurrencyPriceMapper;
import com.fatiharge.repository.CurrencyPriceRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Date;

@ApplicationScoped
public class CurrencyPriceService {

    @Inject
    CurrencyPriceRepository currencyPriceRepository;

    @RestClient
    @Inject
    CurrencyApiClient currencyApiClient;

    @Inject
    CurrencyPriceMapper currencyPriceMapper;

    @Transactional
    public FindLatestResponse findLatest(String baseCurrency) {
        CurrencyPrice latest = currencyPriceRepository.findLatest(baseCurrency);
        if (latest == null || isDataOutdated(latest)) {
            ApiFetchCurrencyPriceResponse apiFetchCurrencyPriceResponse = currencyApiClient.fetchCurrencyPrice(baseCurrency);
            latest = currencyPriceMapper.currencyPriceFromApiResponse(apiFetchCurrencyPriceResponse);
            latest.baseCurrency = baseCurrency;
            currencyPriceRepository.persist(latest);
            latest.createdDate = new Date();
        }
        return currencyPriceMapper.findLatestResponseFromCurrencyPrice(latest);
    }

    private boolean isDataOutdated(CurrencyPrice latest) {
        long timeDifference = System.currentTimeMillis() - latest.createdDate.getTime();
        return timeDifference > 1000 * 60 * 10; // 10 min
    }
}
