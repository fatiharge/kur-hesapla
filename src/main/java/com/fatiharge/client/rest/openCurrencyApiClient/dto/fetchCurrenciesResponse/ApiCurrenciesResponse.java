package com.fatiharge.client.rest.openCurrencyApiClient.dto.fetchCurrenciesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiCurrenciesResponse {
    public String date;
    @JsonProperty("usd")
    public ApiCurrenciesData apiCurrenciesData;
}


