package br.ufc.qxd.controller;

import java.io.IOException;
import java.util.Scanner;

import br.ufc.qxd.service.ClienteService;
import br.ufc.qxd.service.LivroCadastroService;
import br.ufc.qxd.service.LivroListarService;
import br.ufc.qxd.service.LivroVendaService;

public class PrincipalController {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ClienteService clienteService = new ClienteService();
		LivroListarService livroListarService = new LivroListarService();
		LivroCadastroService livroCadastroService = new LivroCadastroService();
		LivroVendaService livroVendaService = new LivroVendaService();

		System.out.println("Livraria do Yoda!! A melhor livraria de todas!!");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		byte op = -3;
		while (op != 0) {
			System.out.println("01 - Serviços de cliente; 02 - Livros; 00 - Sair");
			switch (op = s.nextByte()) {
			case 1:
				while (op != -1) {
					System.out.println("Opções de serviços cliente:\n" + "01 - Cadastrar Cliente;\n"
							+ "02 - Listar Clientes;\n" + "03 - Excluir Clientes\n" + "-01 - Voltar;\n");
					switch (op = s.nextByte()) {
					case 1:
						clienteService.adicionarCliente();
						break;
					case 2:
						clienteService.listarClientes();
						break;
					case 3:
						clienteService.removerCliente();
						break;
					}
					op = -3;
				}
				break;
			case 2:
				while (op != -2) {
					System.out.println("Opções de livros:\n" + "01 - Cadastrar livro;\n" + "02 - Listar livros:\n"
							+ "03 - Vender livros:\n" + "-02 - Voltar ao menu principal:\n");
					switch (op = s.nextByte()) {
					case 1:
						System.out.println("Cadastro de livros!\n");
						while (op != -99) {
							System.out
									.println("01 - Cadastrar livro de aventura:\n" + "02 - Cadastrar livro de drama:\n"
											+ "03 - Cadastrar livro de comédia:\n" + "-99 - Voltar");
							switch (op = s.nextByte()) {
							case 1:
								livroCadastroService.cadastrarLivroAventura();
								break;
							case 2:
								livroCadastroService.cadastrarLivroDrama();
								break;
							case 3:
								livroCadastroService.cadastrarLivroComedia();
								break;
							}
						}
						op = -3;
						break;
					case 2:
						System.out.println("Listagem de livros!\n");
						while (op != -99) {
							System.out.println("01 - Listar livros de aventura:\n" + "02 - Listar livros de drama:\n"
									+ "03 - Listar livros de comédia:\n" + "-99 - Voltar:\n");
							switch(op = s.nextByte()) {
								case 1:
									livroListarService.listarLivrosAventura();
									break;
								case 2:
									livroListarService.listarLivrosDrama();
									break;
								case 3:
									livroListarService.listarLivrosComedia();
									break;
							}
							
						}
						op = -3;
						break;
					case 3:
						System.out.println("Venda de livros!\n");
						while(op != -99) {
							System.out.println("01 - Vender livros de aventura:\n" + "02 - Vender livros de drama:\n"
									+ "03 - Vender livros de comédia:\n" + "-99 - Voltar:\n");
							switch(op = s.nextByte()) {
								case 1:
									livroVendaService.vendaLivroAventura();
									break;
								case 2:
									livroVendaService.vendaLivroDrama();
									break;
								case 3:
									livroVendaService.vendaLivroComedia();
									break;
							}
						}
						op = -3;
						break;
					}
				}
				op = -3;
				break;
			case 0:
				System.out.println("Obrigado por usar o sistema livraria by uendeu!!");
			}
		}
		System.exit(0);
	}
}
