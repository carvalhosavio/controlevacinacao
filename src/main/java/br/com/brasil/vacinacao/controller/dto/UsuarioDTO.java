package br.com.brasil.vacinacao.controller.dto;

import br.com.brasil.vacinacao.model.Usuario;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author savio
 */
public class UsuarioDTO {
    @NotBlank
    private String nome;
    @Email@NotEmpty
    private String email;
    @NotEmpty
    private String cpf;
    @NotNull
    private LocalDate dataNascimento;

    public UsuarioDTO() {
    }

    public Usuario transformaParaUsuario() {
        return new Usuario(nome,email,cpf,dataNascimento);
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
