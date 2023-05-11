/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.contreller;

import com.example.demo.model.Agendamento;
 
import com.example.demo.service.AgendamentoService;
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
public class AgendamentoController {
    
    @Autowired
    private AgendamentoService agendamentoService;
    
    @GetMapping("/agendamento")
    public ResponseEntity<List<Agendamento>> listaClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.listaAgendamento());
    }
    
    /* @PathVariable vincula o parâmetro passado pelo método com a variável do path */
    @GetMapping("agendamento/{codAgendamento}")
    public ResponseEntity<Optional<Agendamento>> getByIdCliente(@PathVariable Integer codAgendamento){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.getByIdAgendamento(codAgendamento));
    }

    @PostMapping("agendamento")
    public ResponseEntity<Agendamento> salvaAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.salvaAgendamento(agendamento));
    }

    @PutMapping("agendamento")
    public ResponseEntity<Agendamento> atualizaAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.atualizaAgendamento(agendamento));
    }
    
    /* @PathVariable vincula o parâmetro passado pelo método com a variável do path */
    @DeleteMapping("agendamento/{codAgendamento}")
    public ResponseEntity<String> deleteByIdAgendamento(@PathVariable Integer codAgendamento){
        agendamentoService.deleteByIdAgendamento(codAgendamento);
        return ResponseEntity.status(HttpStatus.OK).body("Cliente removido com sucesso");
    }   
    
    
    
    
    
    
}
