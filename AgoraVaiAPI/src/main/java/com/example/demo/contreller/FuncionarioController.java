/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.contreller;
 
import com.example.demo.model.Cliente;
import com.example.demo.model.Funcionario;
import com.example.demo.service.FuncionarioService;
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
public class FuncionarioController {
    
    
    @Autowired
    private FuncionarioService funcionarioService;
    
    
        @GetMapping("/funcionario")
    public ResponseEntity<List<Funcionario>> listaFuncionario(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.listaFuncionario());
    }
    
    
           @GetMapping("Funcionario/{codFuncionario}")
      public ResponseEntity<Optional<Funcionario>> getByIdCliente(@PathVariable Integer codcliente){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.getByIdFuncionario(codcliente));
    }
    @PostMapping("funcionario")
    public ResponseEntity<Funcionario> salvaFuncionario(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.salvaFuncionario(funcionario));
    }
    
        @PutMapping("funcionario")
    public ResponseEntity<Funcionario> atualizaCliente(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.atualizaFuncionario(funcionario));
    }
    
    /* @PathVariable vincula o parâmetro passado pelo método com a variável do path */
     @DeleteMapping("funcionario/{codFuncionario}")
    public ResponseEntity<String> deleteByIdCliente(@PathVariable Integer codFuncionario){
        funcionarioService.deleteByIdFuncionario(codFuncionario);
        return ResponseEntity.status(HttpStatus.OK).body("Cliente removido com sucesso");
    }   
    
    
}
