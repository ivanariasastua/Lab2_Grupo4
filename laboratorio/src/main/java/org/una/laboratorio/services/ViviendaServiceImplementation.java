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
import org.una.laboratorio.dto.ViviendaDTO;
import org.una.laboratorio.repositories.IViviendaRepository;
import org.una.laboratorio.util.ServiceConvertionHelper;

@Service
public class ViviendaServiceImplementation implements IViviendaService{

    @Autowired
    IViviendaRepository Viviendarepository;
    
    @Override
    @Transactional(readOnly = true)
    public Optional<List<ViviendaDTO>> findAll() {
        return ServiceConvertionHelper.findList(Viviendarepository.findAll(), ViviendaDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ViviendaDTO> findById(Long id) {
        return ServiceConvertionHelper.oneToOptionalDto(Viviendarepository.findById(id), ViviendaDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<List<ViviendaDTO>> filtroVivienda(String provincia, String canton, boolean terraza, boolean piscina, boolean jardin, boolean garaje) {
        return ServiceConvertionHelper.findList(Viviendarepository.filtroVivienda(provincia, canton, terraza, piscina, jardin, garaje), ViviendaDTO.class);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<List<ViviendaDTO>> findBySuperficieNumHabitacionesNumBanosTerrazaPiscinaJardinGaraje(Float superficie, Integer numH, Integer numBanos, boolean terraza, boolean piscina, boolean jardin, boolean garaje) {
        return ServiceConvertionHelper.findList(Viviendarepository.filterBySuperficieNumHabitacionesNumBanosTerrazaPiscinaJardinGaraje(superficie, numH, numBanos, terraza, piscina, jardin, garaje), ViviendaDTO.class);
    }
    
}
