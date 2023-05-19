/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author JOÃO
 */

@Entity
@Table(name= "agendamento")
public class Agendamento {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codAgendamento")
     private Integer codAgendamento;
     
     
     @ManyToOne
    @JoinColumn(name = "codCliente")
    @JsonIgnore
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codFuncionario")
    @JsonIgnore
    private Funcionario funcionario;

    @Column(name = "tempo")
    private int tempo;

    @Column(name = "data")
    private int data;


    public Agendamento() {
    }

    public Agendamento(Integer codAgendamento, Cliente cliente, Funcionario funcionario, int tempo, int data) {
        this.codAgendamento = codAgendamento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.tempo = tempo;
        this.data = data;
    }


    @Override
    public String toString() {
        return "Agendamento{" +
                "codAgendamento=" + codAgendamento +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                ", tempo=" + tempo +
                ", data=" + data +
                '}';
    }
}
