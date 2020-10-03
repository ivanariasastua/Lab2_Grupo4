/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.services;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio.dto.EmpresaDTO;

/**
 *
 * @author cordo
 */
public interface IEmpresaService {
    
    public Optional<List<EmpresaDTO>> findAll();

    public Optional<EmpresaDTO> findById(Long id);
    
    public Optional<List<EmpresaDTO>> filtroEmpresa(String provincia, String canton, Float importe);
}
