package com.estruturaDados.pilha.labs;

public class Livro {

	private String nome;
	private String isbn;
	private String ano;

	public Livro(String nome, String isbn, String ano) {
		super();
		this.nome = nome;
		this.isbn = isbn;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Livro = Nome: " + nome + ", ISBN: " + isbn + ", Ano:" + ano;
	}

}
