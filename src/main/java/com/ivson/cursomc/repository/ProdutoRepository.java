package com.ivson.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
