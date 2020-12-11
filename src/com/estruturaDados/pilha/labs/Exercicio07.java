package com.estruturaDados.pilha.labs;

import com.estruturaDados.pilhas.Pilha;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//entreda de dos numeros
		
		System.out.println(qualquerBase(25, 2));
		System.out.println(qualquerBase(25, 16));
		System.out.println(qualquerBase(10035, 8));
		System.out.println(qualquerBase(10035, 16));

	}
	
	public static String binario(int num) {
		
		Pilha<Integer> pilha = new Pilha<>();
		String numeroBinario = "";
		int resto;
		
		while(num > 0) {
			resto = num % 2; // 0 ou 1
			pilha.empilhar(resto); //empilha o resto.
			num = num / 2;
			
		}
		while(!pilha.estarVazia()) {
			numeroBinario += pilha.desempilha();
		}
		return numeroBinario;
	}
	
	//metodo para pegar qualquer base decimal
	public static String qualquerBase(int num, int base) {
		
		
		Pilha<Integer> pilha = new Pilha<>();
		String numeroBase = "";
		int resto;
		
		String bases = "0123456789ABCDEF";
		
		while(num > 0) {
			resto = num % base;
			pilha.empilhar(resto); //empilha o resto.
			num = num / base;
			
		}
		while(!pilha.estarVazia()) {
			numeroBase += bases.charAt(pilha.desempilha());
		}
		return numeroBase;
	}

}
