package aplicacao;

import dominio.Pessoa;

public class Aplication {
	public static void  main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1, "afranio", "afra@gm");
		Pessoa pessoa2 = new Pessoa(2, "beto", "beto@gm");
		Pessoa pessoa3 = new Pessoa(3, "margot", "margo@gm");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}
}
