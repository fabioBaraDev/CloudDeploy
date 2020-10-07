package br.com.fiap.cadastroAluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.cadastroAluno.cadastroAluno.model.ClienteModel;


@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, String> {

}
