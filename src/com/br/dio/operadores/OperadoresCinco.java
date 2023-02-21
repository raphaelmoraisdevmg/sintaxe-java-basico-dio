package com.br.dio.operadores;

public class OperadoresCinco {

	public static void main(String[] args) {
		// operadores logicos
		boolean condicaoUm = true;
		boolean condicaoDois = false;
		System.out.println(condicaoUm && condicaoDois); // false
		System.out.println(condicaoUm || condicaoDois); // true
		condicaoDois = true;
		System.out.println(condicaoUm && condicaoDois); // true
		System.out.println(condicaoUm || condicaoDois); // true
		System.out.println((7 < 3) && condicaoDois); // false
	}

}
