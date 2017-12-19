package br.com.boot.financa.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.boot.financa.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	
}
