package com.minhaempresa.WebClientFeign;

import lombok.Data;

@Data
public class CepDTO {
    String cep;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;
    String ibge;
    String gia;
    String ddd;
    String siafi;
}
