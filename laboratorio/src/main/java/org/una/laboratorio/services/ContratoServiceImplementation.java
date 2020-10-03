/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.una.laboratorio.dto.ContratoDTO;
import org.una.laboratorio.repositories.IContratoRepository;
import org.una.laboratorio.util.ServiceConvertionHelper;

/**
 *
 * @author cordo
 */

@Service
public class ContratoServiceImplementation implements IContratoService{
    
    @Autowired
    private IContratoRepository contraroRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<List<ContratoDTO>> findAll() {
        return ServiceConvertionHelper.findList(contraroRepository.findAll(), ContratoDTO.class);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Optional<ContratoDTO> findById(Long id) {
        return ServiceConvertionHelper.oneToOptionalDto(contraroRepository.findById(id), ContratoDTO.class);
    }

}
