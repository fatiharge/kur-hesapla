package com.fatiharge.repository;

import com.fatiharge.domain.HistoricalCurrencyPrice;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Date;
import java.util.List;


@ApplicationScoped
public class HistoricalCurrencyPriceRepository implements PanacheRepository<HistoricalCurrencyPrice> {

    public List<HistoricalCurrencyPrice> findByBaseCurrencyAndDate(
            String baseCurrency,
            Date date
    ) {
        return find("baseCurrency = ?1  AND date = ?2", baseCurrency, date).list();
    }
}
