package com.br.dio.anatomia;

public class AnatomiaTres {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String meuNome = "Raphael"
//		// tipo declarado iniciando com letra maiúscula abaixo por que é primitivo		
//		int anodefabricação = 2022;
//		boolean  verdadeiro = false;
//		// toda declaração de variavel possui um tipo e um nome bem definido.
		String nomeCompleto = nomeCompleto("Raphael"," Almeida de Morais");
		System.out.println(nomeCompleto);
	}
	// exemplo de metodo abaixo
	public static String nomeCompleto(String primeiroNome,String segundoNome) {
		return primeiroNome + segundoNome;
	}
}
