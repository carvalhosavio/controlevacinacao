package br.com.brasil.vacinacao.service;

import br.com.brasil.vacinacao.model.Usuario;
import br.com.brasil.vacinacao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author savio
 */
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cradastro(Usuario usuario){
           return usuarioRepository.save(usuario);
    }

    public Boolean emailCpfCadastrado(String cpf, String email){
        Optional<Usuario> usuarioCpf = usuarioRepository.findByCpf(cpf);
        Optional<Usuario> usuarioEmail = usuarioRepository.findByEmail(email);
        if(usuarioCpf.isPresent()){ return true; }
        if (usuarioEmail.isPresent()){return true; }
        return false;
    }

    public Optional<Usuario> findByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

}
