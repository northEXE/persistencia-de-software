package br.ufc.qxd.controller;

import java.io.IOException;

import br.ufc.qxd.service.ClienteService;

public class PrincipalController {
	public static void main(String[] args) throws IOException {
		ClienteService clienteService = new ClienteService();
		clienteService.adicionarCliente();
	}
}
