package br.com.ciandt.thiagodf;

import java.util.Scanner;

public class OperacaoMatematicaMain implements OperacaoMatematica {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Operador: ex 1 +, 2  ");
		int operador = sc.nextInt();
		
		
		if (operador == 1) {
			
			System.out.println("Digite o Primeiro valor: ");
			int primeiroValor = sc.nextInt();
			
			System.out.println("Digite o Segundo valor: ");
			int segundoValor = sc.nextInt();
		} 
	}

	@Override
	public void calcula(int x, int y) {
		
		
	}
	
	public int Divisao(int x, int y) {
		return x / y;
	}
	
	public int Multiplicacao(int x, int y) {
		return x * y;
	}

}
