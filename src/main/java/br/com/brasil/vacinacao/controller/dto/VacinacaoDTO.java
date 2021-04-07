package br.com.brasil.vacinacao.controller.dto;

import br.com.brasil.vacinacao.model.Usuario;
import br.com.brasil.vacinacao.model.Vacinacao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author savio
 */
public class VacinacaoDTO {
    @NotBlank
    private String nomeVacina;
    @NotBlank @Email
    private String emailUsuario;
    @NotNull
    private LocalDate dataAplicacao;

    public Vacinacao transformaParaVacinacao(Usuario usuario){
        return new Vacinacao(nomeVacina,usuario,dataAplicacao);
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
}
