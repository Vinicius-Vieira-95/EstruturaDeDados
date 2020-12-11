package com.estruturaDados.pilhas;

import com.estruturaDados.base.EstruturaEstatica;

 // A classe Pilha está recebendo a herança da classe EstruturaEstatica
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

	// pegando o ultimo elemento que está no topo.
	public T topo() {
		if (this.estarVazia()) { // reaproveitando o metodo da classe Mãe.
			return null;
		}
		return this.elementos[qtd - 1];
	}

	// removendo o ultimo elemento que está no topo.
	public T desempilha() {
		if (this.estarVazia()) {
			return null;
		}
		T elemento = this.elementos[qtd - 1];
		qtd--;
		return elemento;
	}

}
