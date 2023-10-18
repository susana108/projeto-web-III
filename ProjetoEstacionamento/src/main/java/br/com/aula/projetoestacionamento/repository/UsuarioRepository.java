package br.com.aula.projetoestacionamento.repository;

import br.com.aula.projetoestacionamento.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}