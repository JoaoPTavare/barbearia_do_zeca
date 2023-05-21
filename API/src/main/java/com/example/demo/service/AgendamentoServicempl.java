/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Agendamento;
import com.example.demo.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author JOÃO
 */
public class AgendamentoServicempl  implements AgendamentoService{

    @Autowired
    private AgendamentoRepository repository;


    @Override
    public Agendamento salvaAgendamento(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    @Override
    public List<Agendamento> listaAgendamento() {
        return repository.findAll();
    }

    @Override
    public Optional<Agendamento> getByIdAgendamento(Integer codAgendamento) {
        return repository.findById(codAgendamento);
    }

    @Override
    public Agendamento atualizaAgendamento(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    @Override
    public void deleteByIdAgendamento(Integer codAgendamento) {
       repository.deleteById(codAgendamento);
    }


}
