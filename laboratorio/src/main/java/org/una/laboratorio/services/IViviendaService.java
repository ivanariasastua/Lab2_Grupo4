/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.services;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio.dto.ViviendaDTO;

public interface IViviendaService {
    
    public Optional<List<ViviendaDTO>> findAll();

    public Optional<ViviendaDTO> findById(Long id);
}
