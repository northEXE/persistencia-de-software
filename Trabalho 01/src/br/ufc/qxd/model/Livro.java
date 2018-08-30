package br.ufc.qxd.model;

import java.io.Serializable;

public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long isbn;
	private String titulo;
	private Double valor;
	private Integer qtdEstoque;

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String toString() {
		return "Título do livro: " + titulo + "\nISBN: " + isbn + "\nValor: " + valor + "\nQunatidade em estoque: "
				+ qtdEstoque + "\n";
	}

}
