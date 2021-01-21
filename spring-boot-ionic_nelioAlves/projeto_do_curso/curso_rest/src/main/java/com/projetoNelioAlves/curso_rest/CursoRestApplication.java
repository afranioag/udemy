package com.projetoNelioAlves.curso_rest;

import com.projetoNelioAlves.curso_rest.domain.Categoria;
import com.projetoNelioAlves.curso_rest.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursoRestApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//populando o banco de dados dessa forma e com o arquivo data.sql
		Categoria cate1 = new Categoria(null, "sereais");
		Categoria cate2 = new Categoria(null, "doces");

		categoriaRepository.saveAll(Arrays.asList(cate1, cate2));
	}
}
