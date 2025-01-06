package com.fatiharge.dto.findLatestResponse;


import com.fasterxml.jackson.annotation.JsonProperty;

public class FindLatestResponse {
    @JsonProperty("meta")
    public FindLatestMeta findLatestMeta;
    @JsonProperty("data")
    public FindLatestData findLatestData;
}
