package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
        //Json Alias es unicamente para lectura
        @JsonProperty("Title") String titulo,
        @JsonProperty("totalSeasons") int numTemporadas,
        @JsonProperty("Year") String year
) {
}
