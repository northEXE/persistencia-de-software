package br.ufc.qxd.model;

public class LivroComedia extends Livro {

	private static final long serialVersionUID = 1L;
	private boolean capaTipoBrochura;

	public boolean isCapaTipoBrochura() {
		return capaTipoBrochura;
	}

	public void setCapaTipoBrochura(boolean capaTipoBrochura) {
		this.capaTipoBrochura = capaTipoBrochura;
	}
}
