package com.firstapp.atividadeoito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AtividadeSeisApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtividadeSeisApplication.class, args);
    }

}
