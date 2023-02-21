package com.dio.docs;

public class Comentarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// comentário de uma linha
		/* comentário de multiplas
		 * linhas*/
		/** 
		 * com as duas estrelas aqui e criado um comentário de documentação
		 *  
		 *  */
	}
	public int somaMultiplica (int n , int x,String m) {
		int r = 0; // r é igual ao resultado
		if(m == "M") { // M = Multiplicação
			r = n*x;
		}else {
			// se não soma mesmo
			r= n +x;
		}
		return r;
	}
}
