package br.ufc.qxd.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import br.ufc.qxd.model.LivroAventura;
import br.ufc.qxd.model.LivroComedia;
import br.ufc.qxd.model.LivroDrama;

public class LivroVendaService {
	String ARQUIVO_AVENTURA = "arquivos_livro_aventura/";
	String ARQUIVO_DRAMA = "arquivos_livro_drama/";
	String ARQUIVO_COMEDIA = "arquivos_livro_comedia/";

	Scanner s = new Scanner(System.in);
	Scanner b = new Scanner(System.in);

	LivroListarService livroListarService = new LivroListarService();

	public void vendaLivroAventura() throws ClassNotFoundException, IOException {
		LivroAventura livroAventura = livroListarService.listarLivrosAventura();
		if (livroAventura == null) {
			System.err.println("Não há livros disponíveis para venda!!");
		} else {
			System.out.println("Digite quantos livros deseja vender:\n");
			Integer novoEstoque = 0, qtdVenda = s.nextInt();
			novoEstoque = livroAventura.getQtdEstoque() - qtdVenda;

			livroAventura.setTitulo(livroAventura.getTitulo());
			livroAventura.setIsbn(livroAventura.getIsbn());
			livroAventura.setValor(livroAventura.getValor());
			livroAventura.setQtdEstoque(novoEstoque);
			livroAventura.setTipoIlustracao(livroAventura.getTipoIlustracao());

			OutputStream osA = new FileOutputStream(
					ARQUIVO_AVENTURA + livroAventura.getIsbn() + "-" + livroAventura.getTitulo());
			ObjectOutputStream outA = new ObjectOutputStream(osA);
			outA.writeObject(livroAventura);

			System.out.println("Livro vendido com sucesso!!");

			osA.close();
			outA.close();
		}
	}

	public void vendaLivroDrama() throws ClassNotFoundException, IOException {
		LivroDrama livroDrama = livroListarService.listarLivrosDrama();
		if (livroDrama == null) {
			System.err.println("Não há livros disponíveis para venda!!");
		} else {
			System.out.println("Digite quantos livros deseja vender:\n");
			Integer novoEstoque = 0, qtdVenda = s.nextInt();
			
			novoEstoque = livroDrama.getQtdEstoque() - qtdVenda;

			livroDrama.setTitulo(livroDrama.getTitulo());
			livroDrama.setIsbn(livroDrama.getIsbn());
			livroDrama.setValor(livroDrama.getValor());
			livroDrama.setQtdEstoque(novoEstoque);
			livroDrama.setTemCapaDura(livroDrama.isTemCapaDura());

			OutputStream osD = new FileOutputStream(
					ARQUIVO_DRAMA + livroDrama.getIsbn() + "-" + livroDrama.getTitulo());
			ObjectOutputStream outD = new ObjectOutputStream(osD);
			outD.writeObject(livroDrama);

			System.out.println("Livro vendido com sucesso!!");

			osD.close();
			outD.close();
		}
	}

	public void vendaLivroComedia() throws ClassNotFoundException, IOException {
		LivroComedia livroComedia = livroListarService.listarLivrosComedia();
		if (livroComedia == null) {
			System.err.println("Não há livros disponíveis para venda!!");
		} else {
			System.out.println("Digite quantos livros deseja vender:\n");
			Integer novoEstoque = 0, qtdVenda = s.nextInt();
			novoEstoque = livroComedia.getQtdEstoque() - qtdVenda;
			
			System.out.println(novoEstoque);

			livroComedia.setTitulo(livroComedia.getTitulo());
			livroComedia.setIsbn(livroComedia.getIsbn());
			livroComedia.setValor(livroComedia.getValor());
			livroComedia.setQtdEstoque(novoEstoque);
			livroComedia.setCapaTipoBrochura(livroComedia.isCapaTipoBrochura());

			OutputStream osD = new FileOutputStream(
					ARQUIVO_COMEDIA + livroComedia.getIsbn() + "-" + livroComedia.getTitulo());
			ObjectOutputStream outD = new ObjectOutputStream(osD);
			outD.writeObject(livroComedia);

			System.out.println("Livro vendido com sucesso!!");

			osD.close();
			outD.close();
		}
	}
}
