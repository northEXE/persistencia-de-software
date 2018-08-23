package br.ufc.qxd.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import br.ufc.qxd.model.LivroAventura;
import br.ufc.qxd.model.LivroComedia;
import br.ufc.qxd.model.LivroDrama;

public class LivroCadastroService {
	public static final String ARQUIVO_AVENTURA = "livrosAventura.txt";
	public static final String ARQUIVO_DRAMA = "livrosDrama.txt";
	public static final String ARQUIVO_COMEDIA = "livrosComedia.txt";
	Scanner s = new Scanner(System.in);
	Scanner b = new Scanner(System.in);

	public void cadastrarLivroAventura() throws IOException {

		OutputStream osA = new FileOutputStream(ARQUIVO_AVENTURA, true);
		ObjectOutputStream outA = new ObjectOutputStream(osA);

		System.out.println(
				"Digite o título, ISBN(sem separadores), valor, a quantidade em estoque, e os tipos de ilustrações:\n");

		LivroAventura livroAventura = new LivroAventura();
		livroAventura.setTitulo(s.nextLine());
		livroAventura.setIsbn(b.nextLong());
		livroAventura.setValor(b.nextDouble());
		livroAventura.setQtdEstoque(b.nextInt());
		livroAventura.setTipoIlustracao(s.nextLine());
		outA.writeObject(livroAventura);

		osA.close();
		outA.close();

	}

	public void cadastrarLivroDrama() throws IOException {
		
		OutputStream osD = new FileOutputStream(ARQUIVO_DRAMA, true);
		ObjectOutputStream outD = new ObjectOutputStream(osD);

		System.out.println(
				"Digite o título, ISBN(sem separadores), valor, a quantidade em estoque, e se o livro possui capa dura (escrever true ou false):\n");

		LivroDrama livroDrama = new LivroDrama();
		livroDrama.setTitulo(s.nextLine());
		livroDrama.setIsbn(b.nextLong());
		livroDrama.setValor(b.nextDouble());
		livroDrama.setQtdEstoque(b.nextInt());
		livroDrama.setTemCapaDura(s.nextBoolean());
		outD.writeObject(livroDrama);

		osD.close();
		outD.close();

	}
	
	public void cadastrarLivroComedia() throws IOException {
		
		OutputStream osC = new FileOutputStream(ARQUIVO_DRAMA, true);
		ObjectOutputStream outC = new ObjectOutputStream(osC);

		System.out.println(
				"Digite o título, ISBN(sem separadores), valor, a quantidade em estoque, e se o livro possui capa tipo brochura (escrever true ou false):\n");

		LivroComedia livroComedia = new LivroComedia();
		livroComedia.setTitulo(s.nextLine());
		livroComedia.setIsbn(b.nextLong());
		livroComedia.setValor(b.nextDouble());
		livroComedia.setQtdEstoque(b.nextInt());
		livroComedia.setCapaTipoBrochura(s.nextBoolean());
		outC.writeObject(livroComedia);

		osC.close();
		outC.close();
	}
	
}
