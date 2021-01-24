package com.projetoNelioAlves.curso_rest.repository;

import com.projetoNelioAlves.curso_rest.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
