/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Agendamento;
import com.example.demo.service.AgendamentoService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/apiAgendamento")
public class AgendamentoController {
    
     @Autowired
    private AgendamentoService agendamentoService;



    @GetMapping
    public ResponseEntity<List<Agendamento>> listaAgendamento() {
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.listaAgendamento());
}

    @GetMapping("agendamento/{codAgendamento}")

    public ResponseEntity<Optional<Agendamento>> getByIdAgendamento(@PathVariable Integer codAgendamento){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.getByIdAgendamento(codAgendamento));
    }



    @PostMapping
    public ResponseEntity<Agendamento> salvaAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.salvaAgendamento(agendamento));
    }


    @PutMapping
    public ResponseEntity<Agendamento> atualizaAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.atualizaAgendamento(agendamento));
    }


    @DeleteMapping("agendamento/{codAgendamento}")
    public ResponseEntity<String> deleteByIdAgendamento(@PathVariable Integer codAgendamento){
        agendamentoService.deleteByIdAgendamento(codAgendamento);
        return ResponseEntity.status(HttpStatus.OK).body("Agendamento cancelado");
    }



}
