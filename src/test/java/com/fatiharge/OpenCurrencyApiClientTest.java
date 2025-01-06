package com.fatiharge;

import com.fatiharge.client.rest.openCurrencyApiClient.OpenCurrencyApiClient;
import com.fatiharge.client.rest.openCurrencyApiClient.dto.fetchCurrenciesResponse.ApiCurrenciesResponse;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;


@QuarkusTest
public class OpenCurrencyApiClientTest {

    @Inject
    @RestClient
    OpenCurrencyApiClient openCurrencyApiClient;

    @Test
    public void testFetchCurrencyPrice() {

        String baseCurrency = "usd";
        String date = "2024-03-07";

        ApiCurrenciesResponse response = openCurrencyApiClient.currencies(date, baseCurrency);
        System.out.println("response.data.btc");
        System.out.printf("%.10f%n", response.apiCurrenciesData.BTC);
    }
}

