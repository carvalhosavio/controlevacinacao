package br.com.brasil.vacinacao.controller;

import br.com.brasil.vacinacao.controller.dto.VacinacaoDTO;
import br.com.brasil.vacinacao.controller.dto.VacinacaoRespostaDTO;
import br.com.brasil.vacinacao.model.Usuario;
import br.com.brasil.vacinacao.model.Vacinacao;
import br.com.brasil.vacinacao.service.UsuarioService;
import br.com.brasil.vacinacao.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

/**
 * @author savio
 */
@RestController
@RequestMapping("/vacinacao")
public class VacinacaoController {
    private final VacinacaoService vacinacaoService;
    private final UsuarioService usuarioService;

    @Autowired
    public VacinacaoController(VacinacaoService vacinacaoService, UsuarioService usuarioService){
        this.vacinacaoService = vacinacaoService;
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<VacinacaoRespostaDTO> aplicacaoVacina(@RequestBody @Valid VacinacaoDTO dto){
        Optional<Usuario> usuario = usuarioService.findByEmail(dto.getEmailUsuario());
        if (usuario.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        Vacinacao vacinacao = vacinacaoService.cadastro(dto.transformaParaVacinacao(usuario.get()));
        return ResponseEntity.status(HttpStatus.CREATED).body(VacinacaoRespostaDTO.transformaEmDTO(vacinacao));
    }
}
