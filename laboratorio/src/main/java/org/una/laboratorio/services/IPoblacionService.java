/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.services;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio.dto.PoblacionDTO;

public interface IPoblacionService {
    
    public Optional<List<PoblacionDTO>> findAll();

    public Optional<PoblacionDTO> findById(Long id);
}
