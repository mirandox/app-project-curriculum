package com.mirandox.curriculum.domain;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private String idade;
    private String email;
    private String telefone;
    private String formacao;
    private String expProfissional;
    private String qualiComplementares;

    public Pessoa(String nome, String idade, String email, String telefone, String formacao,
                  String expProfissional, String qualiComplementares) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.formacao = formacao;
        this.expProfissional = expProfissional;
        this.qualiComplementares = qualiComplementares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExpProfissional() {
        return expProfissional;
    }

    public void setExpProfissional(String expProfissional) {
        this.expProfissional = expProfissional;
    }

    public String getQualiComplementares() {
        return qualiComplementares;
    }

    public void setQualiComplementares(String qualiComplementares) {
        this.qualiComplementares = qualiComplementares;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", formacao='" + formacao + '\'' +
                ", expProfissional='" + expProfissional + '\'' +
                ", qualiComplementares='" + qualiComplementares + '\'' +
                '}';
    }
}
