package com.br.dio.metodos;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	public static void main(String[] args) {
		
		
	}
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	public void aumentarVolume() {
		this.volume ++;
		System.out.println("Aumentando o volume para : "+this.volume);
	}
	public void diminuirVolume() {
		this.volume --;
		System.out.println("diminuindo o volume para : "+this.volume);
	}
	public void incrementaCanal() {
		canal ++;
		System.out.println("Icrementando o canal: "+this.canal);
	}
	public void decrementandoCanal() {
		canal --;
		System.out.println("Decrementando o canal: "+this.canal);
	}
}
