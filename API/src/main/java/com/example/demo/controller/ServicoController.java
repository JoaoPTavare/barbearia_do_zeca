/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Funcionario;
import com.example.demo.model.Servico;
import com.example.demo.service.FuncionarioService;
import com.example.demo.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

 
@RestController
@RequestMapping("/api")

public class ServicoController {




    @Autowired
    private ServicoService servicoService;

    @GetMapping("/servico")
    public ResponseEntity<List<Servico>> listaServico(){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.listaServico());
    }

    @GetMapping("servico/{codServico}")
    public ResponseEntity<Optional<Servico>> getByIdServico(@PathVariable Integer codServico){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.getByIdServico(codServico));
    }

    @PutMapping("servico")
    public ResponseEntity<Servico> atualizaServico(@RequestBody Servico servico){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.atualizaServico(servico));
    }

    @PostMapping("servico")
    public ResponseEntity<Servico> salvaServico(@RequestBody Servico servico){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoService.salvaServico(servico));
    }



    @DeleteMapping("servico/{codServico}")
    public ResponseEntity<String> deleteByIdCliente(@PathVariable Integer codServico){
        servicoService.deleteByIdServico(codServico);
        return ResponseEntity.status(HttpStatus.OK).body("Funcionario removido com sucesso");
    }



}
