package com.fatiharge.resource;

import com.fatiharge.domain.CurrencyPrice;
import com.fatiharge.service.CurrencyPriceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/currency-price")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CurrencyPriceResource {

    @Inject
    CurrencyPriceService currencyPriceService;

    @GET
    @Path("/{baseCurrency}")
    public CurrencyPrice findLatest(@PathParam("baseCurrency") String baseCurrency) {
        return currencyPriceService.findLatest(baseCurrency);
    }
}
