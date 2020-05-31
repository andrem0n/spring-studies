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
    Funcionario chefe = this.funcionarioRepository.findById(funcionario.getChefe().getCodigo())
        .orElseThrow(IllegalArgumentException::new);

    funcionario.setChefe(chefe);

    return this.funcionarioRepository.save(funcionario);
  }

  @Override
  public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate) {
    return this.funcionarioRepository.obterFuncionariosPorRangeDeIdade(de, ate);
  }

  @Override
  public Funcionario findByNome(String nome) {
    return this.funcionarioRepository.findByNome(nome);
  }
}
