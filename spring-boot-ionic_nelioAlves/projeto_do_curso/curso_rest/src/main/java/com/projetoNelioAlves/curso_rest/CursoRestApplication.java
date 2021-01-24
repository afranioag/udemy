package com.projetoNelioAlves.curso_rest;

import com.projetoNelioAlves.curso_rest.domain.*;
import com.projetoNelioAlves.curso_rest.domain.enums.TipoCliente;
import com.projetoNelioAlves.curso_rest.repository.*;
import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
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

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

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
		Estado es3 = new Estado(null, "Rio Grande do Norte");
		Estado es4 = new Estado(null, "Paraiba");

		Cidade cid1 = new Cidade(null, "Uberlancia", es1);
		Cidade cid2 = new Cidade(null, "São Paulo", es2);
		Cidade cid3 = new Cidade(null, "Campinas", es2);
		Cidade parelhas = new Cidade(null, "Parelhas", es3);
		Cidade campina = new Cidade(null, "Campina Grande", es4);

		es1.getCidades().addAll(Arrays.asList(cid1));
		es2.getCidades().addAll(Arrays.asList(cid2, cid3));
		es3.getCidades().addAll(Arrays.asList(parelhas));
		es4.getCidades().addAll(Arrays.asList(campina));



		Cliente cli1 = new Cliente(null, "Afranio A. Garcia", "afranio@gmail.com",
				"09363100000", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("8399999", "848988989"));

		Endereco end1 = new Endereco(null, "Rua Alonso Bezerra","241",
				"casa", "maria 3", "59360000", cli1, parelhas);

		Endereco end2 = new Endereco(null, "avd Ricardo Wagner", "30",
				"Cond Cristiana ap 01", "bodocongó", "5800000", cli1, campina );

		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));


		categoriaRepository.saveAll(Arrays.asList(cate1, cate2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(es1, es2, es3, es4));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3, parelhas, campina));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1, end1));

	}
}
