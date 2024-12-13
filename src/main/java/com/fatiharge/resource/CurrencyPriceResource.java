package com.fatiharge.resource;

import com.fatiharge.dto.findLatestResponse.FindLatestResponse;
import com.fatiharge.service.CurrencyPriceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;


@Path("/currency-price")
public class CurrencyPriceResource {

    @Inject
    CurrencyPriceService currencyPriceService;

    @GET
    @Path("/{baseCurrency}")
    @Operation(summary = "Find the latest currency price",
            description = "Fetch the latest price for the given base currency."
    )
    public FindLatestResponse findLatest(
            @PathParam("baseCurrency") String baseCurrency,
            @HeaderParam("X-API-KEY") @Parameter(description = "API Key for authentication") String apiKey,
            @HeaderParam("User-Agent") @Parameter(description = "The User-Agent header of the request") String userAgent
    ) {
        return currencyPriceService.findLatest(baseCurrency);
    }
}
