package com.br.dio.metodos;

public class MetodosUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// o metodo deve ser nomeado como verbo, deve seguir o padrão camel case
		// um metodo tem uma única responsabilidade, não executa mais que um procedimento.
		// os métodos devem ser declarados dentro de uma classe
		double resultado = somar(10,10);
		System.out.println(resultado);
	}
	public static double somar (int num1, int num2) {
		return num1 + num2;
	}
}
