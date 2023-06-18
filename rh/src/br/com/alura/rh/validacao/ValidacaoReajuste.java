package br.com.alura.rh.validacao;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

     public void Validar(Funcionario funcionario, BigDecimal aumento);
}