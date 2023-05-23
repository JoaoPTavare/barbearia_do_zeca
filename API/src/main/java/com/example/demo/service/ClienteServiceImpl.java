/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;


    @Override
    public Cliente salvaCliente(Cliente cliente) {
      return repository.save(cliente);
    }

    @Override
    public List<Cliente> listaClientes() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> getByIdCliente(Integer codCliente){
        return repository.findById(codCliente);
    }

    @Override
    public Cliente atualizaCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public void deleteByIdCliente(Integer codCliente) {
        repository.deleteById(codCliente);
    }
}
