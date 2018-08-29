package br.ufc.qxd.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import br.ufc.qxd.model.LivroAventura;

public class LivroListarService {
	public static final String ARQUIVO_AVENTURA = "livrosAventura.txt";
	public static final String ARQUIVO_DRAMA = "livrosDrama.txt";
	public static final String ARQUIVO_COMEDIA = "livrosComedia.txt";

	public void listarLivrosAventura() throws IOException {
		ArrayList<LivroAventura> listaLivro = new ArrayList<LivroAventura>();
		InputStream isA = new FileInputStream(ARQUIVO_AVENTURA);
		ObjectInputStream in = new ObjectInputStream(isA);

		while(true) {
		try {
			listaLivro.add((LivroAventura) in.readObject());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			break;
		}
		
		}

		in.close();
		isA.close();
	}

	public void listarLivrosDrama() {

	}

	public void listarLivrosComedia() {

	}
}
