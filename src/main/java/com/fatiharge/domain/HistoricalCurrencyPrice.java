package com.fatiharge.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;


@Entity
@Table(name = "historical_currency_price")
public class HistoricalCurrencyPrice extends PanacheEntity {
    @Column(name = "base_currency")
    private String baseCurrency;

    @Column(name = "target_currency")
    private String targetCurrency;

    @Column(name = "price")
    private Double price;

    @Column(name = "date")
    private Date date;
}
