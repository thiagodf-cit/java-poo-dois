package br.com.ciandt.thiagodf.operacaomatematica;

/**
 * Class Multiplicação
 * 
 * @author thiagodf
 *
 */
public class Multiplicacao implements OperacaoMatematica {
	
	/**
	 * Método recebe 2 inteiros e realisa a multiplicação.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	@Override
	public int calcula(int x, int y) {
		return x * y;
	}
	
}
