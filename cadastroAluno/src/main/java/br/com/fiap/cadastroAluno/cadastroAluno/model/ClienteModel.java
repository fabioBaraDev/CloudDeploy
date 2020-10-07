package br.com.fiap.cadastroAluno.cadastroAluno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CLIENTE")
public class ClienteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clienteId;
	
	@Column(name="nome")
	private String nome;

	@Column(name="cpf")
	private String cpf;
	
	@Column(name="dataNascimento")
	private String dataNascimento;
	
	@Column(name="nomeMae")
	private String nomeMae;
	
	@Column(name="endereco", columnDefinition="TEXT")
	private String endereco;

}
