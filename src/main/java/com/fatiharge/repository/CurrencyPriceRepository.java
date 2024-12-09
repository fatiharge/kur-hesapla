package com.fatiharge.repository;

import com.fatiharge.domain.CurrencyPrice;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class CurrencyPriceRepository implements PanacheRepository<CurrencyPrice> {


    public CurrencyPrice findLatest(String baseCurrency) {
        return find("baseCurrency = ?1 ORDER BY lastUpdated DESC", baseCurrency).firstResult();
    }
}
