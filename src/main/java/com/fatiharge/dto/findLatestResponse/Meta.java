package com.fatiharge.dto.findLatestResponse;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.Date;

public class Meta {
    public String baseCurrency;

    @Schema(type = SchemaType.STRING,
            format = "date-time",
            pattern = "yyyy-MM-dd'T'HH:mm:ss"
    )
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX",
            timezone = "Europe/Istanbul"
    )
    public Date createdDate;
}
