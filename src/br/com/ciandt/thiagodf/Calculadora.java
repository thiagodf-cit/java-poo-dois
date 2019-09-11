package br.com.ciandt.thiagodf;

/**
 * Class Abstrata Calculadora
 * @author thiagodf
 *
 */
public abstract class Calculadora {
	
	/**
	 * Método recebe 2 inteiros e realiza a divisão.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static double Divisao(double x, double y) {
		return x / y;
	}
	
	/**
	 * Método recebe 2 inteiros e realiza a multiplicação.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static double Multiplicacao(double x, double y) {
		return x * y;
	}
	
	/**
	 * Método recebe 2 inteiros e realisa a soma.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static double Soma(double x, double y) {
		return x + y;
	}
	
	/**
	 * Método recebe 2 inteiros e realiza a subtração.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static double Subtracao(double x, double y) {
		return x - y;
	}

}
