package com.fatiharge.resource;

import com.fatiharge.domain.HistoricalCurrencyPrice;
import com.fatiharge.service.HistoricalCurrencyPriceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Path("historical-currency-price")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HistoricalCurrencyPriceResource {

    @Inject
    HistoricalCurrencyPriceService historicalCurrencyPriceService;

    @GET
    public List<HistoricalCurrencyPrice> getHistoricalPrices(
            @QueryParam("baseCurrency") String baseCurrency,
            @QueryParam("date") String date
            // (e.g. 2024-12-09)
    ) throws ParseException {
        Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return historicalCurrencyPriceService.findByBaseCurrencyAndDate(baseCurrency, parsedDate);
    }

}
