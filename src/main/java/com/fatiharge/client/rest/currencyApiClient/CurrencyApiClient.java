package com.fatiharge.client.rest.currencyApiClient;


import com.fatiharge.client.rest.currencyApiClient.dto.fetchCurrencyPrice.ApiFetchCurrencyPriceResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;


@RegisterRestClient(configKey = "currency-api-client")
public interface CurrencyApiClient {


    @GET
    @Path("/latest")
    @ClientHeaderParam(name = "apikey",
            value = "${currency.api.apikey}"
    )
    ApiFetchCurrencyPriceResponse fetchCurrencyPrice(@QueryParam("base_currency") String baseCurrency);
}
