package com.estruturaDados.vetor;

import com.estruturaDados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{

	public Lista2() {
	}
	
	public Lista2(int tamanho) {
		super(tamanho);
	}

	public boolean adcionar(T elemento) {
		return super.adcionar(elemento);
	}
	
	public boolean adcionar(int posicao, T elemento) {
		return super.adciona(elemento, posicao);
	}
	
}
