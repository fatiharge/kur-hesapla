package com.fatiharge.dto.historicalPricesResponse;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HistoricalPricesResponse {
    @JsonProperty("meta")
    public HistoricalPricesMeta historicalPricesMeta;
    @JsonProperty("data")
    public List<HistoricalPricesData> historicalPricesDataList;
}
