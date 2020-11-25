package com.estruturaDados.vetor.teste;

import com.estruturaDados.vetor.Vetor;

public class Aula8 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);

		vetor.addcionar("A");
		vetor.addcionar("B");
		vetor.addcionar("C");
		vetor.addcionar("D");
		vetor.addcionar("F");
		vetor.addcionar("G");
		
		System.out.println(vetor.toString());
		
		vetor.removerPorElemento("C");
		
		System.out.println(vetor.toString());
		
	}

}
