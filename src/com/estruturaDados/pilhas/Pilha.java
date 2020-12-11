package com.estruturaDados.pilhas;

import com.estruturaDados.base.EstruturaEstatica;

 // A classe Pilha est� recebendo a heran�a da classe EstruturaEstatica
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

	// pegando o ultimo elemento que est� no topo.
	public T topo() {
		if (this.estarVazia()) { // reaproveitando o metodo da classe M�e.
			return null;
		}
		return this.elementos[qtd - 1];
	}

	// removendo o ultimo elemento que est� no topo.
	public T desempilha() {
		if (this.estarVazia()) {
			return null;
		}
		T elemento = this.elementos[qtd - 1];
		qtd--;
		return elemento;
	}

}
