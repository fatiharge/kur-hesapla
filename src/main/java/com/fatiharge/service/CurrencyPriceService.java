package com.fatiharge.service;

import com.fatiharge.client.rest.CurrencyApiClient;
import com.fatiharge.client.rest.dto.fetchCurrencyPrice.FetchCurrencyPriceResponse;
import com.fatiharge.entity.CurrencyPrice;
import com.fatiharge.dto.findLatestResponse.FindLatestResponse;
import com.fatiharge.mapper.CurrencyPriceMapper;
import com.fatiharge.repository.CurrencyPriceRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.rest.client.inject.RestClient;

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
            FetchCurrencyPriceResponse fetchCurrencyPriceResponse = currencyApiClient.fetchCurrencyPrice(baseCurrency);
            latest = currencyPriceMapper.currencyPriceFromApiResponse(fetchCurrencyPriceResponse);
            latest.baseCurrency = baseCurrency;
            currencyPriceRepository.persist(latest);
            latest.createdDate = fetchCurrencyPriceResponse.meta.last_updated_at;
        }
        return currencyPriceMapper.findLatestResponseFromCurrencyPrice(latest);
    }

    private boolean isDataOutdated(CurrencyPrice latest) {
        long timeDifference = System.currentTimeMillis() - latest.createdDate.getTime();
        return timeDifference > 1000 * 60 * 10;
    }
}
