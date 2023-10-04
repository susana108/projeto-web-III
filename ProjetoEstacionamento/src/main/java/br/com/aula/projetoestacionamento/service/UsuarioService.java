package br.com.aula.projetoestacionamento.service;

import br.com.aula.projetoestacionamento.entity.Usuario;
import br.com.aula.projetoestacionamento.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Transactional

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
