/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;

/**
 *
 * @author JOÃO
 */
@Entity
@Table(name= "funcionario")
public class Funcionario {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codFuncionario")
    private Integer codFuncionario;


    @Column(name = "email")
    private String email;

    @Column(name = "cpf")
    private int cpf;

    @Column(name = "fone")
    private int fone;

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;

    public Funcionario(){
}

    public Funcionario(Integer codFuncionario, String email, int cpf, int fone, String nome, String senha) {
        this.codFuncionario = codFuncionario;
        this.email = email;
        this.cpf = cpf;
        this.fone = fone;
        this.nome = nome;
        this.senha = senha;
    }


    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codFuncionario=" + codFuncionario +
                ", email='" + email + '\'' +
                ", cpf=" + cpf +
                ", fone=" + fone +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
