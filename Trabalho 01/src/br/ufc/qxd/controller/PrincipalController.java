package br.ufc.qxd.controller;

import java.io.IOException;
import java.util.Scanner;

import br.ufc.qxd.service.ClienteService;
import br.ufc.qxd.service.LivroCadastroService;

public class PrincipalController {
	public static void main(String[] args) throws IOException {
		//ClienteService clienteService = new ClienteService();
		LivroCadastroService livroService = new LivroCadastroService();
		
		livroService.cadastrarLivroAventura();
		/**System.out.println("Livraria do Yoda!! A melhor livraria de todas!!");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		byte op = -3;
		while (op != 0) {
			System.out.println("01 - Serviços de cliente; 02 - Livros; 00 - Sair");
			switch (op = s.nextByte()) {
			case 1:
				while (op != -1) {
					System.out.println("Opções de serviços cliente:\n" + "01 - Cadastrar Cliente;\n" + "02 - Listar Clientes;\n"
							+ "03 - Excluir Clientes\n" + "-01 - Voltar;\n");
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
				}
				break;
			}
		}*/
		System.exit(0);
	}
}
