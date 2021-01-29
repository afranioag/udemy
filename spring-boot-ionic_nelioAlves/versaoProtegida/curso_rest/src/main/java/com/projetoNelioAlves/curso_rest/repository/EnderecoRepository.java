package com.projetoNelioAlves.curso_rest.repository;

import com.projetoNelioAlves.curso_rest.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
