package com.aula.springmongo.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Funcionario {

  private String codigo;
  private String nome;
  private Integer idade;
  private BigDecimal salario;
  private Funcionario chefe;
}
