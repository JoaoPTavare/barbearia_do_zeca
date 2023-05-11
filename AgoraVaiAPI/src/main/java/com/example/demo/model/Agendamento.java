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
@Table(name= "agendamento")
public class Agendamento {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codAgendamento")
    private Integer codAgendamento;

    @Column(name = "codCliente")
    private Integer codCliente;

    @Column(name = "codServico")
    private Integer codServico;


    @Column(name = "codFuncionario")
    private Integer codFuncionario;




}
