package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado  {

    private DadosPessois dadosPessois;
    private String empresa;


    public Terceirizado(String nome, String cpf,Cargo cargo,BigDecimal salario, String empresa) {
        this.dadosPessois = new DadosPessois(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
