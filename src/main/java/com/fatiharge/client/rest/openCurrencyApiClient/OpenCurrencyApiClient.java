package com.fatiharge.client.rest.openCurrencyApiClient;


import com.fatiharge.client.rest.openCurrencyApiClient.dto.fetchCurrenciesResponse.ApiCurrenciesResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(configKey = "open-currency-api-client")
public interface OpenCurrencyApiClient {

    @GET
    @Path("currency-api@{date}/v1/currencies/usd.json")
    ApiCurrenciesResponse currencies(
            @PathParam("date") String date,
            @PathParam("currency") String currency
    );
}