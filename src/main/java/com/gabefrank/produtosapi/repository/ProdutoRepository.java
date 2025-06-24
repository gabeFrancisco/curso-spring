package com.gabefrank.produtosapi.repository;

import com.gabefrank.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> { }
