/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.contreller;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JOÃO
 */
@RestController
@RequestMapping("/api")
public class ClienteController {
  
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> listaClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.listaClientes());
    }
    
       @GetMapping("clientes/{codCliente}")
      public ResponseEntity<Optional<Cliente>> getByIdCliente(@PathVariable Integer codcliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.getByIdCliente(codcliente));
    }
    @PostMapping("clientes")
    public ResponseEntity<Cliente> salvaCliente(@RequestBody Cliente agendamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.salvaCliente(agendamento));
    }

    @PutMapping("clientes")
    public ResponseEntity<Cliente> atualizaCliente(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.atualizaCliente(cliente));
    }
    
    /* @PathVariable vincula o parâmetro passado pelo método com a variável do path */
     @DeleteMapping("cliente/{codcliente}")
    public ResponseEntity<String> deleteByIdCliente(@PathVariable Integer codcliente){
        clienteService.deleteByIdCliente(codcliente);
        return ResponseEntity.status(HttpStatus.OK).body("Cliente removido com sucesso");
    }    
 
    
    
    
    
    
}
