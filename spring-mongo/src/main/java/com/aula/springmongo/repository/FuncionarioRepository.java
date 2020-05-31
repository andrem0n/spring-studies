package com.aula.springmongo.repository;

import com.aula.springmongo.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

}
