package com.aula.springmongo.service.impl;

import com.aula.springmongo.model.Funcionario;
import com.aula.springmongo.repository.FuncionarioRepository;
import com.aula.springmongo.service.FuncionarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

  private FuncionarioRepository funcionarioRepository;

  @Autowired
  public FuncionarioServiceImpl(
      FuncionarioRepository funcionarioRepository) {
    this.funcionarioRepository = funcionarioRepository;
  }

  @Override
  public List<Funcionario> obterTodos() {
    return this.funcionarioRepository.findAll();
  }

  @Override
  public Funcionario obterPorCodigo(String codigo) {
    return this.funcionarioRepository.findById(codigo)
        .orElseThrow(() -> new IllegalArgumentException("Funcionário inexistente!"));
  }

  @Override
  public Funcionario criar(Funcionario funcionario) {
    return this.funcionarioRepository.save(funcionario);
  }
}
