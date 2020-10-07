package br.com.fiap.cadastroAluno.cadastroAluno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.fiap.cadastroAluno.cadastroAluno.dto.ClienteDTO;
import br.com.fiap.cadastroAluno.cadastroAluno.model.ClienteModel;
import br.com.fiap.cadastroAluno.cadastroAluno.service.CadastroClienteService;
import br.com.fiap.cadastroAluno.repository.ClienteRepository;

public class CadastroClienteServiceImpl implements CadastroClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public ResponseEntity<ClienteDTO> consultarPorId(String id) {

		try {
			ClienteModel cliente = repository.findById(id).get();

			ClienteDTO res = new ClienteDTO();
			res.setClienteId(cliente.getClienteId());
			res.setCpf(cliente.getCpf());
			res.setDataNascimento(cliente.getDataNascimento());
			res.setEndereco(cliente.getEndereco());
			res.setNome(cliente.getNome());
			res.setNomeMae(cliente.getNomeMae());
			return new ResponseEntity<ClienteDTO>(res, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<ClienteDTO>(new ClienteDTO(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public ResponseEntity<String> cadastrarCliente(ClienteDTO cliente) {

		try {
			ClienteModel clienteEntity = new ClienteModel();
			clienteEntity.setCpf(clienteEntity.getCpf());
			clienteEntity.setDataNascimento(clienteEntity.getDataNascimento());
			clienteEntity.setEndereco(clienteEntity.getEndereco());
			clienteEntity.setNome(clienteEntity.getNome());
			clienteEntity.setNomeMae(clienteEntity.getNomeMae());

			repository.save(clienteEntity);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<String>("Erro ao salvar o cliente", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<String>("Cliente Salvo com sucesso", HttpStatus.OK);
	}

}
