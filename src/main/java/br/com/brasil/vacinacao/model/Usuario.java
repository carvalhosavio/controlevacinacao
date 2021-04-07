package br.com.brasil.vacinacao.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author savio
 */
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false ,unique = true)
    private String email;
    @Column(nullable = false,unique = true)
    private String cpf;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Vacinacao> vacinacao;

    public Usuario() {
    }

    public Usuario(String nome, String email, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
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
