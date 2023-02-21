package com.br.dio.operadores;

public class OperadorTres {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		String resultado = "";
		// uso do operador ternario para atribuir um texto a uma variável.
		resultado=a == b? "verdadeiro":"falso";
		System.out.println(resultado);
	}

}
