package com.projetoNelioAlves.curso_rest;

import com.projetoNelioAlves.curso_rest.domain.Categoria;
import com.projetoNelioAlves.curso_rest.domain.Cidade;
import com.projetoNelioAlves.curso_rest.domain.Estado;
import com.projetoNelioAlves.curso_rest.domain.Produto;
import com.projetoNelioAlves.curso_rest.repository.CategoriaRepository;
import com.projetoNelioAlves.curso_rest.repository.CidadeRepository;
import com.projetoNelioAlves.curso_rest.repository.EstadoRepository;
import com.projetoNelioAlves.curso_rest.repository.ProdutoRepository;
import org.hibernate.annotations.NaturalId;
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

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

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

		Estado es1 = new Estado(null, "Minas Gerais");
		Estado es2 = new Estado(null, "São Paulo");

		Cidade cid1 = new Cidade(null, "Uberlancia", es1);
		Cidade cid2 = new Cidade(null, "São Paulo", es2);
		Cidade cid3 = new Cidade(null, "Campinas", es2);

		es1.getCidades().addAll(Arrays.asList(cid1));
		es2.getCidades().addAll(Arrays.asList(cid2, cid3));

		categoriaRepository.saveAll(Arrays.asList(cate1, cate2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(es1, es2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));

	}
}
