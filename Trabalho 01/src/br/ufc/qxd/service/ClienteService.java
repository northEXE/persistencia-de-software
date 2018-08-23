package br.ufc.qxd.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import br.ufc.qxd.model.Cliente;

public class ClienteService {

	public static final String ARQUIVO = "clientes.csv";
	Scanner s = new Scanner(System.in);

	public void adicionarCliente() throws IOException {
		System.out.println("Cadastro de Cliente!!\n");
		System.out.println("Digite o nome, CPF, data de nascimento e endereço, respectivamente:\n");
		
		Cliente cliente = new Cliente();
		cliente.setNome(s.nextLine());
		cliente.setCpf(s.nextLine());
		cliente.setDataNascimento(s.nextLine());
		cliente.setEndereco(s.nextLine());

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ARQUIVO, true)));
		pw.append(cliente.getNome() + "," + cliente.getCpf() + "," + cliente.getDataNascimento() + ","
				+ cliente.getEndereco() + ";\n");
		pw.close();

		System.out.println("Cliente Cadastrado com Sucesso!!\n");
	}

	public void listarClientes() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(ARQUIVO)));
		String s = br.readLine();
		
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		
		System.out.println("\n");
		
		br.close();
	}

	public void removerCliente() throws IOException {
		ArrayList<String> aux = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(ARQUIVO)));
		
		System.out.println("Digite os dados do cliente que deseja remover:\n");
		String clienteApagar = s.nextLine();
		String linha = br.readLine();
		
		while (linha != null) {
			if (linha.equals(clienteApagar) == false) {
				aux.add(linha);
			}
			linha = br.readLine();
		}
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ARQUIVO)));
		for(String a : aux) {
			bw.append(a + "\n");
		}
		
		System.out.println("Cliente removido com sucesso!!\n");
		
		bw.close();
	}
}
