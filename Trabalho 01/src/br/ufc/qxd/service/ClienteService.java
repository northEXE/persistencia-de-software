package br.ufc.qxd.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import br.ufc.qxd.model.Cliente;

public class ClienteService {

	public static final String ARQUIVO = "clientes.csv";
	Scanner s = new Scanner(System.in);

	public void adicionarCliente() throws IOException {
		System.out.println("Cadastro de Cliente!!\n");
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome, CPF, data de nascimento e endereço, respectivamente:\n");
		cliente.setNome(s.nextLine());
		cliente.setCpf(s.nextLine());
		cliente.setDataNascimento(s.nextLine());
		cliente.setEndereco(s.nextLine());

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ARQUIVO, true)));
		pw.append(cliente.getNome() + "," + cliente.getCpf() + "," + cliente.getDataNascimento() + ","
				+ cliente.getEndereco() + ";\n");
		pw.close();
		
		System.out.println("Cliente Cadastrado com Sucesso!!");
	}
}
