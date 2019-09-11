package br.com.ciandt.thiagodf.operacaomatematica;

/**
 * Class Divisão
 * 
 * @author thiagodf
 *
 */
public class Divisao implements OperacaoMatematica {
	
	/**
	 * Método recebe 2 inteiros e realisa a divisão.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	@Override
	public int calcula(int x, int y) {
		return x / y;
	}
	
}
