package br.com.ciandt.thiagodf;

import java.lang.Math;

/**
 * Class Calculadora Cientifica.
 * 
 * @author thiagodf
 *
 */
public class CalculadoraCientifica extends Calculadora {
	
	/**
	 * Método static
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Divisão: " +Divisao(200, 2));
		System.out.println("Multiplicação: " +Multiplicacao(18, 3));
		System.out.println("Soma: " +Soma(2500, 2900));
		System.out.println("Subtração: " +Subtracao(1550, 50));
		
		System.out.println("Raiz Quadrada: " +Math.sqrt(100));
		System.out.println("Potência: " +Math.pow(2, 9));

	}

}
