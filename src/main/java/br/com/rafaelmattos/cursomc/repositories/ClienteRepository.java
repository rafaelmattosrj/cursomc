package br.com.rafaelmattos.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaelmattos.cursomc.domain.Cliente;

@Repository
//Camada de acesso a dados
//herdar a classe por JpaRepository, atributo identificador
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
