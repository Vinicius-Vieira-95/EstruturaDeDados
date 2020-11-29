package com.estruturaDados.pilhas;

import com.estruturaDados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}
	
	public Pilha(int tamanho) {
		super(tamanho);
	}

	public void empilhar(T elemento) {
		super.adcionar(elemento);
	}
	
	
	
}
