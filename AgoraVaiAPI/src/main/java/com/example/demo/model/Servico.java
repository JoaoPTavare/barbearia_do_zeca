/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import jakarta.persistence.*;

/**
 *
 * @author JOÃO
 */
@Entity
@Table(name= "servico")
public class Servico {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codServico")
    private Integer codServico;


    @Column(name = "email")
    private Integer codFuncionario;

    @Column(name = "email")
    private Integer codAgendamento;

    @Column(name = "tempo")
    private int tempo;

    @Column(name = "tipo")
    private String tipo;


    public Servico() {
    }

    public Servico(Integer codServico, Integer codFuncionario, Integer codAgendamento, int tempo, String tipo) {
        this.codServico = codServico;
        this.codFuncionario = codFuncionario;
        this.codAgendamento = codAgendamento;
        this.tempo = tempo;
        this.tipo = tipo;
    }

    public Integer getCodServico() {
        return codServico;
    }

    public void setCodServico(Integer codServico) {
        this.codServico = codServico;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Integer getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(Integer codAgendamento) {
        this.codAgendamento = codAgendamento;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "codServico=" + codServico +
                ", codFuncionario=" + codFuncionario +
                ", codAgendamento=" + codAgendamento +
                ", tempo=" + tempo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
