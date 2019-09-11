package br.com.ciandt.thiagodf.operacaomatematica;

/**
 * Class Soma
 * 
 * @author thiagodf
 *
 */
public class Soma implements OperacaoMatematica {
	
	/**
	 * Método recebe 2 inteiros e realisa a soma.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	@Override
	public int calcula(int x, int y) {
		return x + y;
	}

}
