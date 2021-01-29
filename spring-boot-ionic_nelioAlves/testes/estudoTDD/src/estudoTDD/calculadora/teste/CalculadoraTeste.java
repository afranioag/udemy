package estudoTDD.calculadora.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import estudoTDD.calculadora.Calculadora;

public class CalculadoraTeste {

	Calculadora calc = new Calculadora();
	
	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception {
		int valorA = 2;
		int valorB = 1;
		
		int soma = calc.soma(valorA, valorB);		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception {
		int valorA = 2;
		int valorB = 1;
		
		int subtrai = calc.subtrai(valorA, valorB);	
		assertEquals(1, subtrai);
	}
	
	@Test
	public void deveriaMultiplicarDoisValoresPassados() throws Exception {
		int valorA = 13;
		int valorB = 3;
		
		int multiplica = calc.multiplica(valorA, valorB);
		assertEquals(39, multiplica);
	}
	
	@Test
	public void deveriaDividirDoisValoresPassados() throws Exception {
		int valorA = 39;
		int valorB = 3;
		
		int divide = calc.divide(valorA, valorB);
		assertEquals(13, divide);
	}
	
	@Test	
	public void deveriaLancarExcecaoAoDividirPorZer0() throws Exception {
		int valorA = 90;
		
		Assertions.assertThrows( ArithmeticException.class, () -> calc.divide(valorA, 0));
	}
}
