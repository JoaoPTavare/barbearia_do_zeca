/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Funcionario;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author JOÃO
 */
public interface FuncionarioService {
    public Funcionario salvaFuncionario(Funcionario funcionario);

    public List<Funcionario> listaFuncionario();

    public Optional<Funcionario> getByIdFuncionario(Integer codFuncionario);

    public Funcionario atualizaFuncionario(Funcionario funcionario);

    public void deleteByIdFuncionario(Integer codFuncionario);
}
