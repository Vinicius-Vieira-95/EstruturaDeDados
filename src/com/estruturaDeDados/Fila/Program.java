package com.estruturaDeDados.Fila;

public class Program {

	public static void main(String[] args) {

		Fila fila = new Fila(5);
		
		fila.Inserir("Maria");
		fila.Inserir("Pedro");
		fila.Inserir("Mahteus");
		
		System.out.println(fila.toString());
		fila.remover();
		System.out.println(fila.toString());
		fila.remover();
		System.out.println(fila.toString());
		fila.Inserir("Albeto");
		fila.Inserir("Joana");
		System.out.println(fila.toString());
		fila.Inserir("Jorge");
		System.out.println(fila.toString());
		fila.Inserir("Cecilia");
		System.out.println(fila.toString());
		fila.remover();
		System.out.println(fila.toString());
		fila.Inserir("Vinicius");
		System.out.println(fila.toString());
	}
	

}
