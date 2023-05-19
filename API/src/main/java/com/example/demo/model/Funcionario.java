/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author JOÃO
 */
@Entity
@Table(name= "Funcionario")
public class Funcionario {
    
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codFuncionario")
    private Integer codFuncionario;
    
    @Column(name = "nome")
    private String nome;
    
    
     @Column(name = "senha")
    private String senha;
     
    @Column(name = "cpf")
    private int cpf;
       
    @Column(name = "fone")
    private int  fone;

    public Funcionario() {
    }

    public Funcionario(Integer codFuncionario, String nome, String senha, int cpf, int fone) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.fone = fone;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
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

    @Override
    public String toString() {
        return "Funcionario{" + "codFuncionario=" + codFuncionario + ", nome=" + nome + ", senha=" + senha + ", cpf=" + cpf + ", fone=" + fone + '}';
    }
    
    
    
    
    
}    
    
