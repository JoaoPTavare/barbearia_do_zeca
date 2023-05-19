/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Funcionario;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author JOÃO
 */
public class FuncionarioServicempl implements  FuncionarioService{

    @Override
    public Funcionario salvaFuncionario(Funcionario funcionario) {
        return null;
    }

    @Override
    public List<Funcionario> listaFuncionario() {
        return null;
    }

    @Override
    public Optional<Funcionario> getByIdFuncionario(Integer codFuncionario) {
        return Optional.empty();
    }

    @Override
    public Funcionario atualizaFuncionario(Funcionario funcionario) {
        return null;
    }

    @Override
    public void deleteByIdFuncionario(Integer codFuncionario) {

    }
}
