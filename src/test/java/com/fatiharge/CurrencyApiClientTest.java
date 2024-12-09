package com.fatiharge;

import com.fatiharge.client.rest.CurrencyApiClient;
import com.fatiharge.client.rest.dto.fetchCurrencyPrice.FetchCurrencyPriceResponse;
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

        FetchCurrencyPriceResponse response = currencyApiClient.fetchCurrencyPrice(baseCurrency);

        assertNotNull(response);
        System.out.println(response.data.toString());
        System.out.println(response.meta.last_updated_at);

    }
}

