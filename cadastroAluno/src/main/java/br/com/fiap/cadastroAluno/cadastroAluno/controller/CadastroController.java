package br.com.fiap.cadastroAluno.cadastroAluno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cadastroAluno.cadastroAluno.dto.ClienteDTO;
import br.com.fiap.cadastroAluno.cadastroAluno.service.CadastroClienteService;

@RestController
@RequestMapping("user")
public class CadastroController {

	@Autowired
	private CadastroClienteService clienteService;

	@GetMapping("/{id}")
	public ResponseEntity<ClienteDTO> getDataCliente(@PathVariable String id) {
		return clienteService.consultarPorId(id);
	}

	@PostMapping("/persist")
	public ResponseEntity<String> saveCliente(@RequestBody ClienteDTO cliente) {
		return clienteService.cadastrarCliente(cliente);
	}
}
