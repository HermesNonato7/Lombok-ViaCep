package com.minhaempresa.WebClientFeign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner { // exige método 'run'

    private final WebClient usuarioClient;

    public Initializer(WebClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }

    public void run(String... args) throws Exception {
        CepDTO cepDTO = usuarioClient.buscacep("03818080");
        System.out.println(cepDTO);
    }
}
