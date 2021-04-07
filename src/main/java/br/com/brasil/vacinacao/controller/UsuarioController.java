package br.com.brasil.vacinacao.controller;

import br.com.brasil.vacinacao.controller.dto.UsuarioDTO;
import br.com.brasil.vacinacao.controller.dto.UsuarioRespostaDTO;
import br.com.brasil.vacinacao.model.Usuario;
import br.com.brasil.vacinacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @author savio
 */

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioRespostaDTO> cadastro(@Valid @RequestBody UsuarioDTO dto){
        if (usuarioService.emailCpfCadastrado(dto.getCpf(),dto.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        Usuario usuario = usuarioService.cradastro(dto.transformaParaUsuario());
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioRespostaDTO.transformaEmDTO(usuario));
    }
}
