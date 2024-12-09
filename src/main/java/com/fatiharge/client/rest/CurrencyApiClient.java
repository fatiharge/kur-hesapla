package com.fatiharge.client.rest;


import com.fatiharge.client.rest.dto.fetchCurrencyPrice.FetchCurrencyPriceResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;


@RegisterRestClient
public interface CurrencyApiClient {


    @GET
    @Path("/latest")
    @ClientHeaderParam(name = "apikey",
            value = "${currency.api.apikey}"
    )
    FetchCurrencyPriceResponse fetchCurrencyPrice(@QueryParam("base_currency") String baseCurrency);
}
