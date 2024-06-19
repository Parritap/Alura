package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.DataConversor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var json = new ConsumoAPI()
                .obtenerDatos("http://www.omdbapi.com/?i=tt3896198&apikey=a820f03d&t=You");

        System.out.println(json);

        DatosSerie serie = (new DataConversor()).getData(json, DatosSerie.class);
        System.out.println();
    }
}
