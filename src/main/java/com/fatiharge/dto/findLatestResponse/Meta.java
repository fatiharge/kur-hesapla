package com.fatiharge.dto.findLatestResponse;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Meta {
    public String baseCurrency;

    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd'T'HH:mm:ss",
            timezone = "Europe/Istanbul"
    )
    public Date createdDate;
}
