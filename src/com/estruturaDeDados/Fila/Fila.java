package com.estruturaDeDados.Fila;

public class Fila {

	// tipo de vetor
	private String[] fila;
	
	private int inicio;
	private int fim;

	public Fila(int tamanho) {
		this.fila = new String[tamanho];
		//index da fila
		inicio = 0;
		fim = 0;

	}
	
	public void Inserir(String nome) {
		if(fim >= fila.length) {
			fim = 0;
		}
		fila[fim] = nome;
		fim++;
	}
	public void remover() {
		if(inicio == fila.length) {
			inicio = 0;
		}
		fila[inicio] = "";
		inicio++;
	}
	
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < fila.length; i++) {
			s.append(this.fila[i]);
			if(i + 1 < fila.length) {
				s.append(", ");
			}
		}
		s.append("]");
		return s.toString();
	}
	
}
