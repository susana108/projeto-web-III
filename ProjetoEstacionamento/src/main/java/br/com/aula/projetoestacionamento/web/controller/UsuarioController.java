package br.com.aula.projetoestacionamento.web.controller;

import br.com.aula.projetoestacionamento.entity.Usuario;
import br.com.aula.projetoestacionamento.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    //post ele envia o get vai buscar
    //httpStatus é
    // path ele pega uma variavel e joga para dentro e o resquest é uma requisição
    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        Usuario user = usuarioService.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    @PatchMapping("/{id}")

    public ResponseEntity<Usuario>updatePassword(@PathVariable long id, @RequestBody Usuario usuario){
        Usuario user = usuarioService.editarSenha(id, usuario.getPassword());
        return  ResponseEntity.ok(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getbyId(@PathVariable long id){
        Usuario user = usuarioService.buscarPorId(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll(){
        List<Usuario> users = usuarioService.buscarTodos();
        return  ResponseEntity.ok(users);
    }

}
