package com.projetoNelioAlves.curso_rest.repository;

import com.projetoNelioAlves.curso_rest.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
