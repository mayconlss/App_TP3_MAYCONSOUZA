package br.edu.app_TP3_MAYCONSOUZA.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.app_TP3_MAYCONSOUZA.model.negocio.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
}
