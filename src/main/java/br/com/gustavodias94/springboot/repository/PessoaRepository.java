package br.com.gustavodias94.springboot.repository;

import br.com.gustavodias94.springboot.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
}
