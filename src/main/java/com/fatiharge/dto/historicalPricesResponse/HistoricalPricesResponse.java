package com.fatiharge.dto.historicalPricesResponse;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class HistoricalPricesResponse {
    @JsonProperty("meta")
    public HistoricalPricesMeta historicalPricesMeta;
    @JsonProperty("data")
    public List<HistoricalPricesData> historicalPricesDataList;
    @JsonProperty("errorDates")
    public Map<LocalDate, String> errorDates;
}
