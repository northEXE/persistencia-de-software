package br.ufc.qxd.model;

public class LivroAventura extends Livro {

	private static final long serialVersionUID = 1L;
	private String tipoIlustracao;

	public String getTipoIlustracao() {
		return tipoIlustracao;
	}

	public void setTipoIlustracao(String tipoIlustracao) {
		this.tipoIlustracao = tipoIlustracao;
	}

	@Override
	public String toString() {
		return "T�tulo do livro: " + getTitulo() + "\nISBN: " + getIsbn() + "\nValor: " + getValor()
				+ "\nQunatidade em estoque: " + getQtdEstoque() + "\nTipos de ilustra��o: " + tipoIlustracao;
	}
}
