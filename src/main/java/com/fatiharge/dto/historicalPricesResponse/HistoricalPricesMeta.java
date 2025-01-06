package com.fatiharge.dto.historicalPricesResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class HistoricalPricesMeta {
    public LocalDate startDate;
    public LocalDate endDate;
    public String baseCurrency;
}
