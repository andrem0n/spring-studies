package com.aula.springmongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

  @GetMapping
  public void obterTodos(){

  }

  @GetMapping("/{codigo}")
  public void obterPorCodigo(@PathVariable Long codigo){

  }

  @PostMapping
  public void criar(@RequestBody Object funcionario){
    
  }
}
