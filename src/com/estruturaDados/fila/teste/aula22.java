package com.estruturaDados.fila.teste;

import com.estruturaDeDados.Fila.Fila;

public class aula22 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		
		fila.InserirNaFila(1);
		fila.InserirNaFila(2);
		fila.InserirNaFila(3);
		fila.InserirNaFila(4);
		
		
		System.out.println(fila);
		
		fila.removerDaFila(); // sempre irá remover o primeiro elemento da fila
		
		System.out.println(fila);
	}

}
