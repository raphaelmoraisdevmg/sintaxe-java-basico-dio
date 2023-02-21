package com.br.dio.operadores;

public class OperadoresQuatro {
	// operadores relacionais
	public static void main (String []args) {
		int valorX= 12;
		int valorY= 15;
		String resultado = "";
		resultado= valorX > valorY? "Verdadeiro" : "Falso";
		System.out.println(resultado);
		resultado= valorX < valorY? "Verdadeiro" : "Falso";
		System.out.println(resultado);
		resultado= valorX == valorY? "Verdadeiro" : "Falso";
		System.out.println(resultado);
		resultado= valorX >= valorY? "Verdadeiro" : "Falso";
		System.out.println(resultado);
		resultado= valorX <= valorY? "Verdadeiro" : "Falso";
		// comparando objetos 
		String nomeUm = "Raphael";
		String nomeDois  = "Raphael";
		System.out.println(nomeUm.equals(nomeDois));
	    // para objetos é interessante utilizar o metodo equals.
		
	}
	
	
}
