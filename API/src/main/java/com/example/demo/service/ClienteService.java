/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClienteService {



    public Cliente salvaCliente(Cliente cliente);

    public List<Cliente> listaClientes();


    public Optional<Cliente> getByIdCliente(Integer codCliente);

    public Cliente atualizaCliente(Cliente cliente);

    public void deleteByIdCliente(Integer codCliente);

}
