package com.br.dio.operadores;

public class OperadoresUm {

	public static void main(String[] args) {
		//operador de atribuição
		//tipo char
		char sexo = 'F';
		// tipo boolean
		boolean doadorDeOrgao = false;
		// operador aritimético
		System.out.println("Soma: "+(5+4));
		System.out.println("Subtração: "+(5-4));
		System.out.println("Multiplicação: "+(5*4));
		System.out.println("Divisão: "+(5/4));
		System.out.println("Modulo: "+(5%4)); // operação utilizada para saber se a resto na divisão
		String nomeCompleto = "LINGUAGEM"+"JAVA";
		System.out.println(nomeCompleto);
		//concatenação
		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		concatenacao=1+"1"+1+1; // quando temos uma string a partir dela tudo e concatenado
		System.out.println(concatenacao);
		
	}	

}
