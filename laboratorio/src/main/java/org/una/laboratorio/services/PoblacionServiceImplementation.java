/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.una.laboratorio.dto.PoblacionDTO;
import org.una.laboratorio.repositories.IPoblacionRepository;
import org.una.laboratorio.util.ServiceConvertionHelper;

public class PoblacionServiceImplementation implements IPoblacionService{

    @Autowired
    IPoblacionRepository poblacionRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<List<PoblacionDTO>> findAll() {
        return ServiceConvertionHelper.findList(poblacionRepository.findAll(), PoblacionDTO.class);
    }

    @Override
    public Optional<PoblacionDTO> findById(Long id) {
        return ServiceConvertionHelper.oneToOptionalDto(poblacionRepository.findById(id), PoblacionDTO.class);
    }
    
}
