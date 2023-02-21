package com.br.dio.metodos;

public class Usuario {
	public static void main (String [] args) {
		SmartTv smartTv = new SmartTv();
		System.out.println("Está ligada"+smartTv.ligada);
		System.out.println("Canal atual"+smartTv.canal);
		System.out.println("Volume atual"+smartTv.volume);
		smartTv.ligar();
		System.out.println("Novo status da tv : "+smartTv.ligada);
		smartTv.desligar();
		System.out.println("Novo status da tv : "+smartTv.ligada);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.decrementandoCanal();
		smartTv.incrementaCanal();
		smartTv.incrementaCanal();
		// se a variavel é de calasse ela pode ser acessada em todos os locais da classe
		// se a variavel é de um metodo ela só pode ser acessada ali.
	}
}
