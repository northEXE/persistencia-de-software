package br.ufc.qxd.model;

public class LivroDrama extends Livro{

	private static final long serialVersionUID = 1L;
	private boolean temCapaDura;
	
	public boolean isTemCapaDura() {
		return temCapaDura;
	}
	public void setTemCapaDura(boolean temCapaDura) {
		this.temCapaDura = temCapaDura;
	}

}
