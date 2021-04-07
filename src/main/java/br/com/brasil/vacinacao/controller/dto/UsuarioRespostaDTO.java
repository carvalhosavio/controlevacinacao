package br.com.brasil.vacinacao.controller.dto;

import br.com.brasil.vacinacao.model.Usuario;

import java.time.LocalDate;

/**
 * @author savio
 */
public class UsuarioRespostaDTO {
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;

    public UsuarioRespostaDTO() {
    }

    private UsuarioRespostaDTO(Long id, String nome, String email, String cpf, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public static UsuarioRespostaDTO transformaEmDTO(Usuario usuario) {
        return new UsuarioRespostaDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getCpf(),
                usuario.getDataNascimento()
        );
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
