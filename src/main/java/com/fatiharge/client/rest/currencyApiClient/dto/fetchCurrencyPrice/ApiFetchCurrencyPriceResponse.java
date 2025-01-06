package com.fatiharge.client.rest.currencyApiClient.dto.fetchCurrencyPrice;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiFetchCurrencyPriceResponse {
    @JsonProperty("meta")
    public ApiFetchCurrencyPriceMeta apiFetchCurrencyPriceMeta;
    @JsonProperty("data")
    public ApiFetchCurrencyPriceData apiFetchCurrencyPriceData;
}
