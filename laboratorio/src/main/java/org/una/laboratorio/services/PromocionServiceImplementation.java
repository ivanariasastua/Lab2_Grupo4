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
import org.una.laboratorio.dto.PromocionDTO;
import org.una.laboratorio.repositories.IPromocionRepository;
import org.una.laboratorio.util.ServiceConvertionHelper;

/**
 *
 * @author cordo
 */
@Service
public class PromocionServiceImplementation implements IPromocionService{
    
    @Autowired
    private IPromocionRepository promocionRepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<List<PromocionDTO>> findAll() {
        return ServiceConvertionHelper.findList(promocionRepository.findAll(), PromocionDTO.class);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Optional<PromocionDTO> findById(Long id) {
        return ServiceConvertionHelper.oneToOptionalDto(promocionRepository.findById(id), PromocionDTO.class);
    }
}
