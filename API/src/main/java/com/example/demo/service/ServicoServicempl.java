/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Servico;
import com.example.demo.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoServicempl  implements ServicoService{

    @Autowired
    private ServicoRepository repository;


    @Override
    public Servico salvaServico(Servico servico) {
        return repository.save(servico);
    }

    @Override
    public List<Servico> listaServico() {
        return repository.findAll();
    }

    @Override
    public Optional<Servico> getByIdServico(Integer codServico) {
        return repository.findById(codServico);
    }

    @Override
    public Servico atualizaServico(Servico servico) {

        return repository.save(servico);
    }

    @Override
    public void deleteByIdServico(Integer codServico) {
        repository.deleteById(codServico);
    }
}
