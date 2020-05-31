package com.aula.springmongo.controller;

import com.aula.springmongo.model.Funcionario;
import com.aula.springmongo.service.FuncionarioService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

  private FuncionarioService funcionarioService;

  public FuncionarioController(FuncionarioService funcionarioService) {
    this.funcionarioService = funcionarioService;
  }

  @GetMapping
  public List<Funcionario> obterTodos(){
    return this.funcionarioService.obterTodos();
  }

  @GetMapping("/{codigo}")
  public Funcionario obterPorCodigo(@PathVariable String codigo){
return this.funcionarioService.obterPorCodigo(codigo);
  }

  @PostMapping
  public Funcionario criar(@RequestBody Funcionario funcionario){
    return this.funcionarioService.criar(funcionario);
  }
}
