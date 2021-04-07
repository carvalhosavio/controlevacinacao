package br.com.brasil.vacinacao.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author savio
 */
@Entity
public class Vacinacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeVacina;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    private LocalDate dataAplicacao;

    public Vacinacao() {
    }

    public Vacinacao(String nome, Usuario usuario, LocalDate dataAplicacao) {
        this.nomeVacina = nome;
        this.usuario = usuario;
        this.dataAplicacao = dataAplicacao;
    }

    public Long getId() {
        return id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nome) {
        this.nomeVacina = nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
}
