package br.ufc.qxd.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

import br.ufc.qxd.model.LivroAventura;
import br.ufc.qxd.model.LivroComedia;
import br.ufc.qxd.model.LivroDrama;

public class LivroListarService {
	String ARQUIVO_AVENTURA = "arquivos_livro_aventura/";
	String ARQUIVO_DRAMA = "arquivos_livro_drama/";
	String ARQUIVO_COMEDIA = "arquivos_livro_comedia/";
	
	Scanner b = new Scanner(System.in);

	public boolean checkDir(String caminho) {
		File file = new File(caminho);
		if(!file.exists()) {
			return false;
		} else {
			File[] arquivos = file.listFiles();
			for(File arq : arquivos) {
				System.out.println(arq.getName());
			}
		}
		return true;
	}
	
	public void listarLivrosAventura() throws IOException, ClassNotFoundException {
		boolean check = checkDir(ARQUIVO_AVENTURA);
		if(!check) {
			System.err.println("Não há nenhum livro de aventura cadastrado!!");
		}
		else {
			System.out.println("\nDigite o isbn e o nome do livro (igualmente está na lista) que deseja ver os detalhes:");
			String nomeLivro = b.nextLine();
			
			InputStream isA = new FileInputStream(ARQUIVO_AVENTURA + nomeLivro);
			ObjectInputStream inA = new ObjectInputStream(isA);
			LivroAventura livroAventura = (LivroAventura) inA.readObject();
			
			inA.close();
			isA.close();
			
			System.out.println("\n"+livroAventura);
			
		}
	}

	public void listarLivrosDrama() throws IOException, ClassNotFoundException {
		boolean check = checkDir(ARQUIVO_DRAMA);
		if(!check) {
			System.err.println("Não há nenhum livro de drama cadastrado!!");
		}
		else {
			System.out.println("\nDigite o isbn e o nome do livro (igualmente está na lista) que deseja ver os detalhes:");
			String nomeLivro = b.nextLine();
			
			InputStream isD = new FileInputStream(ARQUIVO_DRAMA + nomeLivro);
			ObjectInputStream inD = new ObjectInputStream(isD);
			LivroDrama livroDrama = (LivroDrama) inD.readObject();
			
			inD.close();
			isD.close();
			
			System.out.println("\n"+livroDrama);
			
		}
	}

	public void listarLivrosComedia() throws IOException, ClassNotFoundException {
		boolean check = checkDir(ARQUIVO_COMEDIA);
		if(!check) {
			System.err.println("Não há nenhum livro de comédia cadastrado!!");
		}
		else {
			System.out.println("\nDigite o isbn e o nome do livro (igualmente está na lista) que deseja ver os detalhes:");
			String nomeLivro = b.nextLine();
			
			InputStream isC = new FileInputStream(ARQUIVO_COMEDIA + nomeLivro);
			ObjectInputStream inC = new ObjectInputStream(isC);
			LivroComedia livroComedia = (LivroComedia) inC.readObject();
			
			inC.close();
			isC.close();
			
			System.out.println("\n"+livroComedia);
			
		}
	}
}
