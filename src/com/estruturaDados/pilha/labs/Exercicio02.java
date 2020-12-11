package com.estruturaDados.pilha.labs;

import java.util.Scanner;

import com.estruturaDados.pilhas.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.print("Numero:");
			int num = scan.nextInt();

			if (num == 0) {
				//pilha par
				Integer desempilhado = par.desempilha();
				if (desempilhado == null) {
					System.out.println("Pilha par vazia");
				} else {
					System.out.println("Desempilhando pilha par: " +desempilhado);
				}

				// pilha impar
				desempilhado = impar.desempilha();
				if (desempilhado == null) {
					System.out.println("Pilha impar vazia");
				} else {
					System.out.println("Desempilhando pilha impar" + desempilhado);
				}

			}
			if (num % 2 == 0) {
				System.out.println("Numero par na pilha par :" + num);
				par.empilhar(num);
			} else {
				System.out.println("Numero impar na pilha impar :" + num);
				impar.empilhar(num);
			}
		}
		
		System.out.println("Desempilhando todos os numeros da pilha par");
		while(!par.estarVazia()) {
			System.out.println("Desempilhando a pilha par: "+par.desempilha());
		}
		
		System.out.println("Desempilhando todos os numeros da pilha impar");
		while(!impar.estarVazia()) {
			System.out.println("Desempilhando a pilha impar: "+impar.desempilha());
		}

		scan.close();
	}

}
