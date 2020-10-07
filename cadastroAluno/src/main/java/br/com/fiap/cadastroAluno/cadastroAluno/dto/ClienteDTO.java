package br.com.fiap.cadastroAluno.cadastroAluno.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ClienteDTO {

	@JsonProperty("clienteId")
	private Integer clienteId;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("cpf")
	private String cpf;

	@JsonProperty("dataNascimento")
	private String dataNascimento;

	@JsonProperty("nomeMae")
	private String nomeMae;

	@JsonProperty("endereco")
	private String endereco;

}
