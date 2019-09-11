package br.com.ciandt.thiagodf.operacaomatematica;

/**
 * Class Operação Matematica Main.
 * 
 * @author thiagodf
 *
 */
public class OperacaoMatematicaMain {

	public static void main(String[] args) {
		
		// Printa o resultado da Divisão
		Divisao divisao = new Divisao();
		System.out.println(divisao.calcula(12, 2));
		
		// Printa o resultado da Multiplicação
		Multiplicacao multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.calcula(304, 200));
		
		// Printa o resultado da Subtração
		Subtracao subtracao = new Subtracao();
		System.out.println(subtracao.calcula(532, 43));
		
		// Printa o resultado da Soma
		Soma soma = new Soma();
		System.out.println(soma.calcula(5, 7));
		
	}

}
