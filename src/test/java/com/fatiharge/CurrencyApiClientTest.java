package com.fatiharge;

import com.fatiharge.client.rest.currencyApiClient.CurrencyApiClient;
import com.fatiharge.client.rest.currencyApiClient.dto.fetchCurrencyPrice.ApiFetchCurrencyPriceResponse;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class CurrencyApiClientTest {

    @Inject
    @RestClient
    CurrencyApiClient currencyApiClient;

    @Test
    public void testFetchCurrencyPrice() {

        String baseCurrency = "USD";

        ApiFetchCurrencyPriceResponse response = currencyApiClient.fetchCurrencyPrice(baseCurrency);

        assertNotNull(response);
        System.out.println(response.apiFetchCurrencyPriceData.toString());
        System.out.println(response.apiFetchCurrencyPriceMeta.last_updated_at);

    }
}

