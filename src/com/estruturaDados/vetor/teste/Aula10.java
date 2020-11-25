package com.estruturaDados.vetor.teste;

import com.estruturaDados.vetor.Vetor;

public class Aula10 {

	public static void main(String[] args) {

		// object
		Vetor vetor = new Vetor(5);

		Aluno al1 = new Aluno("JOao", 12345, 10, 6, 7);
		Aluno al2 = new Aluno("MAria", 12345, 7, 7, 8);
		Aluno al3 = new Aluno("Xico", 12345, 7, 4, 10);
		
		vetor.addcionar(al1);
		vetor.addcionar(al2);
		vetor.addcionar(al3);
		
	}

}
