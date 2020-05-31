package com.aula.springmongo.service;

import com.aula.springmongo.model.Funcionario;
import java.util.List;

public interface FuncionarioService {

  public List<Funcionario> obterTodos();
  public Funcionario obterPorCodigo(String codigo);
  public Funcionario criar(Funcionario funcionario);
}
