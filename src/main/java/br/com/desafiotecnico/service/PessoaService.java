package br.com.desafiotecnico.service;

import br.com.desafiotecnico.domain.Pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa findId(Integer id);

    List<Pessoa> findAll();
    Pessoa insert(Pessoa pessoa);
    void delete(Integer id);
}
