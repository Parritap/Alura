package com.aluracursos.screenmatch.service;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConversor implements IDataConversor {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> myClass) {
        return objectMapper.convertValue(json, myClass);
    }


//    public DatosSerie obtenerDatos (String json){}


}
