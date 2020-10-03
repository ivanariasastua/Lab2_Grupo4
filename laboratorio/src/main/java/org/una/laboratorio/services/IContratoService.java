/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.services;

import java.util.List;
import java.util.Optional;
import org.una.laboratorio.dto.ContratoDTO;

/**
 *
 * @author cordo
 */
public interface IContratoService {
    
    public Optional<List<ContratoDTO>> findAll();

    public Optional<ContratoDTO> findById(Long id);
}
