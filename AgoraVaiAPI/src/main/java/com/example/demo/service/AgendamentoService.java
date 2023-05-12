/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Agendamento;
import com.example.demo.model.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JOÃO
 */
public interface AgendamentoService {
    
    
    public Agendamento salvaAgendamento(Agendamento agendamento);
    
    public List<Agendamento> listaAgendamento();
    
    public Optional<Agendamento> getByIdAgendamento(Integer codAgendamento);
    
    public Agendamento atualizaAgendamento(Agendamento agendamento);
    
    public void deleteByIdAgendamento(Integer codAgendamento);   
    
    
}
