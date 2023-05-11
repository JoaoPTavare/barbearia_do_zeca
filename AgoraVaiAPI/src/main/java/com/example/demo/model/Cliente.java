/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
 

/**
 *
 * @author JOÃO
 */

@Entity
@Table(name= "cliente")
public class Cliente {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcliente")
    private Integer codCliente;
    
    
    
    @Column(name = "nome")
    private String nome;
       
    @Column(name = "cpf")
    private int cpf;
    
       
    @Column(name = "senha")
    private String senha;
    
       
    @Column(name = "email")
    private String email;


    @Column(name = "fone")
    private int fone;

    public Cliente() {
    }

    public Cliente(Integer codCliente, String nome, int cpf, String senha, String email, int fone) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.fone = fone;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", email=" + email + ", fone=" + fone + '}';
    }
    
    
    
    


    
}
