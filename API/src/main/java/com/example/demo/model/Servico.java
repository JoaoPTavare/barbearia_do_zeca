/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

/**
 *
 * @author JOÃO
 */
@Entity
@Table(name= "Servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codServico")
    private Integer codServico;

    @ManyToMany
    @JoinColumn(name = "codAgendamento")
    @JsonIgnore
    @Column(name = "codAgendamento")
    private List<Agendamento> agendamento;



    @ManyToMany
    @JoinColumn(name = "codFuncionario")
    @JsonIgnore
    @Column(name = "codFuncionario")
    private List<Funcionario> funcionario;


    @Column(name = "tipo")
    private String tipo;

    @Column(name = "tempo")
    private int tempo;

    public Servico() {
    }

    public Servico(Integer codServico, List<Agendamento> agendamento, List<Funcionario> funcionario, String tipo, int tempo) {
        this.codServico = codServico;
        this.agendamento = agendamento;
        this.funcionario = funcionario;
        this.tipo = tipo;
        this.tempo = tempo;
    }

    public Integer getCodServico() {
        return codServico;
    }

    public void setCodServico(Integer codServico) {
        this.codServico = codServico;
    }

    public List<Agendamento> getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(List<Agendamento> agendamento) {
        this.agendamento = agendamento;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Servico{" + "codServico=" + codServico + ", agendamento=" + agendamento + ", funcionario=" + funcionario + ", tipo=" + tipo + ", tempo=" + tempo + '}';
    }




}
