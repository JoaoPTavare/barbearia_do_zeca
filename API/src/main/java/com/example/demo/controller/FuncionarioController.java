/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.model.Funcionario;
import com.example.demo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

 

@RestController
@RequestMapping("/api")
public class FuncionarioController {



    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/funcionario")
    public ResponseEntity<List<Funcionario>> listFuncionario(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.listaFuncionario());
    }

    @GetMapping("funcionario/{codFuncionario}")
    public ResponseEntity<Optional<Funcionario>> getByIdCliente(@PathVariable Integer codFuncionario){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.getByIdFuncionario(codFuncionario));
    }

    @PutMapping("funcionario")
    public ResponseEntity<Funcionario> atualizaFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.atualizaFuncionario(funcionario));
    }

    @PostMapping("funcionario")
    public ResponseEntity<Funcionario> salvaFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.salvaFuncionario(funcionario));
    }



    @DeleteMapping("funcionario/{codFuncionario}")
    public ResponseEntity<String> deleteByIdCliente(@PathVariable Integer codFuncionario){
        funcionarioService.deleteByIdFuncionario(codFuncionario);
        return ResponseEntity.status(HttpStatus.OK).body("Funcionario removido com sucesso");
    }


}

