package com.estruturaDeDados.Fila;

import com.estruturaDados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	
	final int POSICAO = 0;
	
	public Fila() {
		super();
	}
	
	public Fila(int tamanho) {
		super(tamanho);
	}
	
	//metod que coloco sempre no fim da fila
	public void InserirNaFila(T elemento) {
		this.adcionar(elemento);
	}
	
	public T verInicio() {
		return this.elementos[0];
	}
	
	//metodo que irá remover o primeiro elemento da fila
	public T removerDaFila() {
		if(this.estarVazia()) {
			System.out.println("Fila não existe");
		}
		//varivel que recebe o primeiro elemento da fila
		T elementoRemovido = this.elementos[POSICAO];
		this.remover(POSICAO); //FIFO
		return elementoRemovido;
	}
	
}
