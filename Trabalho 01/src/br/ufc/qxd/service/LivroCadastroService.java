package br.ufc.qxd.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import br.ufc.qxd.model.LivroAventura;
import br.ufc.qxd.model.LivroComedia;
import br.ufc.qxd.model.LivroDrama;

public class LivroCadastroService {
	String ARQUIVO_AVENTURA = "arquivos_livro_aventura/";
	String ARQUIVO_DRAMA = "arquivos_livro_drama/";
	String ARQUIVO_COMEDIA = "arquivos_livro_comedia/";
	
	Scanner s = new Scanner(System.in);
	Scanner b = new Scanner(System.in);

	public void makeDir(String caminho) {
		File file = new File(caminho);
		if(!file.exists()) {
			file.mkdir();
		}
	}
	
	public void cadastrarLivroAventura() throws IOException {
		makeDir(ARQUIVO_AVENTURA);
		
		System.out.println(
				"Digite o título, ISBN(sem separadores), valor, a quantidade em estoque, e os tipos de ilustrações:\n");

		LivroAventura livroAventura = new LivroAventura();
		livroAventura.setTitulo(s.nextLine());
		livroAventura.setIsbn(b.nextLong());
		livroAventura.setValor(b.nextDouble());
		livroAventura.setQtdEstoque(b.nextInt());
		livroAventura.setTipoIlustracao(s.nextLine());
		
		OutputStream osA = new FileOutputStream(ARQUIVO_AVENTURA + livroAventura.getIsbn() + "-" + livroAventura.getTitulo());
		ObjectOutputStream outA = new ObjectOutputStream(osA);
		outA.writeObject(livroAventura);

		System.out.println("Livro cadastrado com sucesso!!");
		
		osA.close();
		outA.close();

	}

	public void cadastrarLivroDrama() throws IOException {
		makeDir(ARQUIVO_DRAMA);
		
		System.out.println(
				"Digite o título, ISBN(sem separadores), valor, a quantidade em estoque, e se o livro possui capa dura (escrever true ou false):\n");

		LivroDrama livroDrama = new LivroDrama();
		livroDrama.setTitulo(s.nextLine());
		livroDrama.setIsbn(b.nextLong());
		livroDrama.setValor(b.nextDouble());
		livroDrama.setQtdEstoque(b.nextInt());
		livroDrama.setTemCapaDura(s.nextBoolean());
		
		OutputStream osD = new FileOutputStream(ARQUIVO_DRAMA + livroDrama.getIsbn() + "-" + livroDrama.getTitulo());
		ObjectOutputStream outD = new ObjectOutputStream(osD);
		outD.writeObject(livroDrama);
		
		osD.close();
		outD.close();

	}
	
	public void cadastrarLivroComedia() throws IOException {
		makeDir(ARQUIVO_COMEDIA);

		System.out.println(
				"Digite o título, ISBN(sem separadores), valor, a quantidade em estoque, e se o livro possui capa tipo brochura (escrever true ou false):\n");

		LivroComedia livroComedia = new LivroComedia();
		livroComedia.setTitulo(s.nextLine());
		livroComedia.setIsbn(b.nextLong());
		livroComedia.setValor(b.nextDouble());
		livroComedia.setQtdEstoque(b.nextInt());
		livroComedia.setCapaTipoBrochura(s.nextBoolean());
		
		OutputStream osC = new FileOutputStream(ARQUIVO_COMEDIA + livroComedia.getIsbn() + "-" + livroComedia.getTitulo());
		ObjectOutputStream outC = new ObjectOutputStream(osC);
		
		outC.writeObject(livroComedia);

		osC.close();
		outC.close();
	}
	
}
