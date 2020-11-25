package com.estruturaDados.vetor.labs;

import com.estruturaDados.vetor.Lista;

public class Exer01 {

	public static void main(String[] args) {
		
		
		Lista<String> lista = new Lista<String>(5);

		lista.addcionar("A");
		lista.addcionar("B");
		lista.addcionar("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));
	}

}
