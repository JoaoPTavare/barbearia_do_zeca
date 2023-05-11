/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Servico;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JOÃO
 */
public interface ServicoService {
    
    public Servico salvaServico(Servico cliente);
    
    public List<Servico> listaServico();
    
    /*Optional evita exceções como ponteiros nulos por exemplo */
    public Optional<Servico> getByIdServico(Integer codServico);
    
    public Servico atualizaServico(Servico servico);
    
    public void deleteByIdServico(Integer codServico);  
}
