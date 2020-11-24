package com.estruturaDados.vetor.teste;

import com.estruturaDados.vetor.Vetor;

public class Aula7 {

	public static void main(String[] args) {

		//Inserir valor em qualquer posição
		
		Vetor vetor = new Vetor(10);
		
		vetor.addcionar("B");
		vetor.addcionar("C");
		vetor.addcionar("D");
		vetor.addcionar("F");
		vetor.addcionar("G");
		
		System.out.println(vetor.toString());
		
		vetor.adciona("A", 0);
		vetor.adciona("A", 1);
		vetor.adciona("A", 2);
		
		
		System.out.println(vetor.toString());
		
	}

}

