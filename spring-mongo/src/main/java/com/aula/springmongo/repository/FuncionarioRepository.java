package com.aula.springmongo.repository;

import com.aula.springmongo.model.Funcionario;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

  @Query("{ $and: [ {'idade': {$gte: ?0} }, {'idade': {$lte: ?1} } ] }")
  public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);

  public Funcionario findByNome(String nome);
}
