/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
 
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listaClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listaClientes());
    }
    @GetMapping("cliente/{codCliente}")
    public ResponseEntity<Optional<Cliente>> getByIdCliente(@PathVariable Integer codCliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.getByIdCliente(codCliente));
    }

    @PostMapping("cliente")
    public ResponseEntity<Cliente> salvaCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.salvaCliente(cliente));
    }

    @PutMapping("cliente")
    public ResponseEntity<Cliente> atualizaCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.atualizaCliente(cliente));
    }

    /* @PathVariable vincula o parâmetro passado pelo método com a variável do path */
    @DeleteMapping("cliente/{codCliente}")
    public ResponseEntity<String> deleteByIdCliente(@PathVariable Integer codCliente){
        clienteService.deleteByIdCliente(codCliente);
        return ResponseEntity.status(HttpStatus.OK).body("Cliente removido com sucesso");
    }
}
