package com.example.produtoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.produtoservice.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
