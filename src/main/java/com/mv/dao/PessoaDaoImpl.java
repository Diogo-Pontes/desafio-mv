package com.mv.dao;

import org.springframework.stereotype.Repository;

import com.mv.domain.Pessoa;

@Repository
public class PessoaDaoImpl extends AbstractDao<Pessoa, Long> implements PessoaDao {

}
