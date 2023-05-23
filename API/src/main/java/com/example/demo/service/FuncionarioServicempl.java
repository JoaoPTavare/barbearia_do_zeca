/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author JOÃO
 */


@Service
public class FuncionarioServicempl implements FuncionarioService{

    @Autowired
    private FuncionarioRepository funcionarioService;


    @Override
    public Funcionario salvaFuncionario(Funcionario funcionario) {
        return funcionarioService.save(funcionario);
    }




    @Override
    public List<Funcionario> listaFuncionario() {
        return funcionarioService.findAll();
    }

    @Override
    public Optional<Funcionario> getByIdFuncionario(Integer codFuncionario) {
        return funcionarioService.findById(codFuncionario);
    }

    @Override
    public Funcionario atualizaFuncionario(Funcionario funcionario) {
        return funcionarioService.save(funcionario);
    }

    @Override
    public void deleteByIdFuncionario(Integer codFuncionario) {
        funcionarioService.deleteById(codFuncionario);
    }
}
