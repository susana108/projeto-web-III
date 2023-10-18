package br.com.aula.projetoestacionamento.service;

import br.com.aula.projetoestacionamento.entity.Usuario;
import br.com.aula.projetoestacionamento.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    @Transactional(readOnly = true)
    public  Usuario buscarPorId(Long id){
        return  usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("USUARIO NÃO LOCALIZADO")
        );
    }

    @Transactional
    public Usuario editarSenha(long id, String password) {
        Usuario user = buscarPorId(id);
        user.setPassword(password);
        return user;
    }

    @Transactional
    public List<Usuario> buscarTodos() {
        return  usuarioRepository.findAll();
    }
}

