package com.estruturaDados.vetor.teste;

import com.estruturaDados.vetor.Vetor;

public class Aula5 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);

		vetor.addcionar("elemento1");
		vetor.addcionar("elemento2");
		vetor.addcionar("elemento3");
		
		System.out.println(vetor.buscaUmElementoString("elemento2"));
		
		System.out.println(vetor.buscarElementoPosicao(0));

	}

}

