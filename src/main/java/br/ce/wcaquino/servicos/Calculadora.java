package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {

	public int soma(int a, int b) {
		System.out.println("estou aqui");
		return a + b;
	}

	public int subtracao(int a, int b) {
		return a - b;
	}

	public int divisao(int a, int b) throws NaoPodeDividirPorZeroException {
		if (b == 0) {
			throw new NaoPodeDividirPorZeroException();
		}
		return a / b;
	}
	
	public void imprimi(){
		System.out.println("Passei aqui");
	}

}
