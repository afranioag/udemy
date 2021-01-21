package com.projetoNelioAlves.curso_rest;

import com.projetoNelioAlves.curso_rest.domain.Categoria;
import com.projetoNelioAlves.curso_rest.domain.Produto;
import com.projetoNelioAlves.curso_rest.repository.CategoriaRepository;
import com.projetoNelioAlves.curso_rest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursoRestApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//populando o banco de dados dessa forma e com o arquivo data.sql
		Categoria cate1 = new Categoria(null, "informatica");
		Categoria cate2 = new Categoria(null, "escritorio");

		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "mause", 80.00);
		Produto p3= new Produto(null, "impressora", 800.00);

		cate1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cate2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cate1));
		p2.getCategorias().addAll(Arrays.asList(cate1, cate2));
		p3.getCategorias().addAll(Arrays.asList(cate1));

		categoriaRepository.saveAll(Arrays.asList(cate1, cate2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
}
