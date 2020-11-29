package com.estruturaDados.pilha.teste;

import com.estruturaDados.pilhas.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha<Integer>pilha = new Pilha<Integer>(10);
		
		
		for(int i = 0; i < 10; i++) {
			pilha.empilhar(i);
			
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());

	}

}
