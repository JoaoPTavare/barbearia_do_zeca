/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.contreller;

import com.example.demo.model.Funcionario;
import com.example.demo.model.Servico;
import com.example.demo.service.FuncionarioService;
import com.example.demo.service.ServicoService;
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
public class ServicoController {
    
    
    
    
    @Autowired
    private ServicoService servicoService;
  
    
            @GetMapping("/servico")
    public ResponseEntity<List<Servico>> listaServico(){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.listaServico());
    }
    
    
           @GetMapping("servico/{codServico}")
      public ResponseEntity<Optional<Servico>> getByIdCliente(@PathVariable Integer codServico){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.getByIdServico(codServico));
    }
    
      
       @PostMapping("servico")
    public ResponseEntity<Servico> salvaFuncionario(@RequestBody Servico servico){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoService.salvaServico(servico));
    }
    
        @PutMapping("servico")
    public ResponseEntity<Servico> atualizaCliente(@RequestBody Servico servico){
        return ResponseEntity.status(HttpStatus.OK).body(servicoService.atualizaServico(servico));
    }
      
          @DeleteMapping("servico/{codServico}")
    public ResponseEntity<String> deleteByIdCliente(@PathVariable Integer codServico){
        servicoService.deleteByIdServico(codServico);
        return ResponseEntity.status(HttpStatus.OK).body("Cliente removido com sucesso");
    }  
      
      
}
