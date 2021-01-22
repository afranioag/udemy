package com.projetoNelioAlves.curso_rest.repository;

import com.projetoNelioAlves.curso_rest.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
