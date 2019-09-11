package br.com.ciandt.thiagodf.operacaomatematica;

/**
 * Class Subtração
 * 
 * @author thiagodf
 *
 */
public class Subtracao implements OperacaoMatematica {
	
	/**
	 * Método recebe 2 inteiros e realisa a subtração.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	@Override
	public int calcula(int x, int y) {
		return x - y;
	}
	
}
