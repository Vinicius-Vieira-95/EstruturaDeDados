package com.estruturaDados.vetor;

public class Vetor {

	// tipo de vetor
	private String[] elementos;
	int qtd;

	public Vetor(int tamanho) {
		this.elementos = new String[tamanho];
		this.qtd = 0;
	}

	// adcionando elemento no vetor
	public boolean addcionar(String elemento) {
		this.aumentaCapacidade();
		if (this.qtd < this.elementos.length) {
			this.elementos[qtd] = elemento;
			qtd++;
			return true;
		}
		return false;
	}
	
	//adcionando valor em qualquer posição
	public boolean adciona(String s, int posicao) {
		if(!(posicao >= 0 && posicao < qtd)) {
			throw new IllegalArgumentException("Posição invalida, valor acima da quantidade");
		}
		this.aumentaCapacidade();
		for(int i = qtd - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = s;
		this.qtd++;
		return true;
	}
	
	//excluir um elementos em qualquer posição
	public boolean removerPorPosicao(int posicao) {
		if(posicao > qtd && posicao < 0) {
			throw new IllegalArgumentException("Posição não existe");
		}
		for(int i = posicao ; i <= qtd; i++) {
			this.elementos[i - 1] = this.elementos[i];
		}
		this.qtd--;
		return true;
	}
	
	//excluir elemento por string
	public boolean removerPorNome(String nome) {
		for(int i = 0; i < qtd; i++) {
			if(this.elementos[i].equals(nome)) {
				this.elementos[i] = this.elementos[i + 1];
				removerPorPosicao(i + 1);
			}
		}
		return true;
	}
	
	public int tamanho() {
		return this.qtd;
	}
	
	//busca de um elemento pela posição
	public String buscarElementoPosicao(int posicao ) {
		if(!(posicao >= 0 && posicao < qtd)) {
			throw new IllegalArgumentException("Posição invalida");
		}
		return this.elementos[posicao];
	}
	
	//busca de um elemento por String
	public String buscaUmElementoString(String nome) {
		for(int i = 0; i < this.qtd ; i ++) {
			if(this.elementos[i].equals(nome)) {
				return this.elementos[i];
			}
		}
		return "Elemento não existe";
	}
	
	//aumentando a capacidade do vetor
	private void aumentaCapacidade() {
		if(this.qtd == this.elementos.length) {
			//tipo de vetor atribuido
			String[] novoElemento = new String[this.elementos.length * 2];  
			for(int i = 0; i< this.elementos.length; i++) {
				novoElemento[i] = this.elementos[i];
			}	
			this.elementos = novoElemento;
		}
	}

	// imprimir o vetor até o ultimo indice.
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.qtd - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.qtd > 0) {
			s.append(this.elementos[this.qtd - 1]);
		}
		s.append("]");
		return s.toString();
	}
}
