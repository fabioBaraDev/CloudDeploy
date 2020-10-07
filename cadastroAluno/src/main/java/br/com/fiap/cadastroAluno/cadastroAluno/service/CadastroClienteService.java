package br.com.fiap.cadastroAluno.cadastroAluno.service;

import org.springframework.http.ResponseEntity;

import br.com.fiap.cadastroAluno.cadastroAluno.dto.ClienteDTO;

public interface CadastroClienteService {

	public ResponseEntity<ClienteDTO> consultarPorId(String id);
	public ResponseEntity<String> cadastrarCliente(ClienteDTO cliente);
}
