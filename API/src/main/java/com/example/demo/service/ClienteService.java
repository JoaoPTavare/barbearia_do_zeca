/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Cliente;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author JOÃO
 */
public interface ClienteService {



    public Cliente salvaCliente(Cliente cliente);

    public List<Cliente> listaClientes();

    /*Optional evita exceções como ponteiros nulos por exemplo */
    public Optional<Cliente> getByIdCliente(Integer codCliente);

    public Cliente atualizaCliente(Cliente cliente);

    public void deleteByIdCliente(Integer codCliente);

}
