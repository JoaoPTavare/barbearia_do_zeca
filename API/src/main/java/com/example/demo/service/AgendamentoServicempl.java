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


public class AgendamentoServicempl  implements AgendamentoService{

    @Autowired
    private AgendamentoRepository agendamentoRepository;


    @Override
    public Agendamento salvaAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> listaAgendamento() {
        return agendamentoRepository.findAll();
    }

    @Override
    public Optional<Agendamento> getByIdAgendamento(Integer codAgendamento) {
        return agendamentoRepository.findById(codAgendamento);
    }

    @Override
    public Agendamento atualizaAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public void deleteByIdAgendamento(Integer codAgendamento) {
        agendamentoRepository.deleteById(codAgendamento);
    }


}
