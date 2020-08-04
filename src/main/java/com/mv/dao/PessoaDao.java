package com.mv.dao;

import java.util.List;

import com.mv.domain.Pessoa;

public interface PessoaDao {

	void save(Pessoa pessoa );

    void update(Pessoa pessoa);

    void delete(Long id);

    Pessoa findById(Long id);

    List<Pessoa> findAll();

}
