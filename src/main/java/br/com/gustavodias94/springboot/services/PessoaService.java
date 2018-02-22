package br.com.gustavodias94.springboot.services;

import br.com.gustavodias94.springboot.model.Pessoa;

import java.util.List;

public interface PessoaService {

    List<Pessoa> buscarTodasPessoas();

    Pessoa cadastrarPessoa(Pessoa pessoa);
}
