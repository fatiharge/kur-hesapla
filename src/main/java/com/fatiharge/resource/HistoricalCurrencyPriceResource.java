package com.fatiharge.resource;

import com.fatiharge.dto.historicalPricesResponse.HistoricalPricesResponse;
import com.fatiharge.service.HistoricalCurrencyPriceService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

import java.time.LocalDate;


@Path("historical-currency-price")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HistoricalCurrencyPriceResource {

    @Inject
    HistoricalCurrencyPriceService historicalCurrencyPriceService;

    @GET
    @Operation(summary = "Fetch historical currency prices",
            description = "Fetches historical currency prices for the specified date range and base currency. The start and end dates must be provided as query parameters.")
    public HistoricalPricesResponse getHistoricalPrices(
            @QueryParam("start-date")
            @Parameter(description = "Start date (e.g. 2024-12-09)", required = true)
            LocalDate startDate,
            @QueryParam("end-date")
            @Parameter(description = "End date (e.g. 2024-12-10)", required = true)
            LocalDate endDate,
            @HeaderParam("X-API-KEY")
            @Parameter(description = "API Key for authentication")
            @SuppressWarnings("unused")
            String apiKey,
            @HeaderParam("User-Agent")
            @Parameter(description = "The User-Agent header of the request")
            @SuppressWarnings("unused")
            String userAgent
    ) {
        return historicalCurrencyPriceService.fetchHistoricalPricesFromDate(startDate, endDate);
    }

}
