package com.fatiharge.repository;

import com.fatiharge.entity.HistoricalCurrencyPrice;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.List;


@ApplicationScoped
public class HistoricalCurrencyPriceRepository implements PanacheRepository<HistoricalCurrencyPrice> {

    public List<HistoricalCurrencyPrice> findByBaseCurrencyAndDate(
            String baseCurrency,
            LocalDate startDate,
            LocalDate endDate
    ) {
        return find("baseCurrency = ?1  AND date >= ?2 AND date <= ?3", baseCurrency, startDate, endDate).list();
    }
}
