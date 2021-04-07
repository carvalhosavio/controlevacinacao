package br.com.brasil.vacinacao.controller.dto;

import br.com.brasil.vacinacao.model.Vacinacao;

import java.time.LocalDate;

/**
 * @author savio
 */
public class VacinacaoRespostaDTO {
    private Long id;
    private String nome;
    private String emailUsuario;
    private LocalDate dataAplicacao;

    public VacinacaoRespostaDTO(Long id,String nome, String emailUsuario, LocalDate dataAplicacao) {
        this.id = id;
        this.nome = nome;
        this.emailUsuario = emailUsuario;
        this.dataAplicacao = dataAplicacao;
    }

    public static VacinacaoRespostaDTO transformaEmDTO(Vacinacao vacinacao){
        return new VacinacaoRespostaDTO(vacinacao.getId(),vacinacao.getNomeVacina(),vacinacao.getUsuario().getEmail(),vacinacao.getDataAplicacao());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
