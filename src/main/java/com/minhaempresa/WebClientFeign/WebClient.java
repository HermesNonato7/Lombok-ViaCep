package com.minhaempresa.WebClientFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "cep")
public interface WebClient {
    @GetMapping("{cep}/json")
    CepDTO buscacep(@PathVariable("cep") String cep);
}
