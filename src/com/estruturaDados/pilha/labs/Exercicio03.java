package com.estruturaDados.pilha.labs;

import java.util.Scanner;

import com.estruturaDados.pilhas.Pilha;

public class Exercicio03 {

	
	public static void main(String [] arg) {
		
		Scanner sc = new Scanner(System.in);
		Pilha<Livro> livro = new Pilha<>(20);
		
		System.out.print("quantos livro vc deseja adcionar: ");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < num; i++) {
			
			System.out.println("Livro #"+i);
			System.out.print("Nome do autor: ");
			String nome = sc.next();
			System.out.print("ISBN:");
			String isbn = sc.next();
			System.out.print("Ano: ");
			String ano = sc.next();
			
			Livro livro1 = new Livro(nome, isbn, ano);
			
			livro.empilhar(livro1);
			
		}
		
		System.out.println("Desempilhando os livros");
		while(!livro.estarVazia()) {
			System.out.println("Retirando o livro: "+ livro.desempilha());
		}
		
		
	}
	
	
}
