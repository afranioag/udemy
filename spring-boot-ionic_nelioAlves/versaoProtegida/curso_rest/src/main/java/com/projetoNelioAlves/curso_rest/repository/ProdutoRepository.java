package com.projetoNelioAlves.curso_rest.repository;

import com.projetoNelioAlves.curso_rest.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
