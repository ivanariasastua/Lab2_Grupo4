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
import org.una.laboratorio.dto.EmpresaDTO;
import org.una.laboratorio.repositories.IEmpresaRepository;
import org.una.laboratorio.util.ServiceConvertionHelper;

/**
 *
 * @author cordo
 */
@Service
public class EmpresaServiceImplementation implements IEmpresaService {
    
    @Autowired
    private IEmpresaRepository empresaRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<List<EmpresaDTO>> findAll() {
        return ServiceConvertionHelper.findList(empresaRepository.findAll(), EmpresaDTO.class);
    }
    
    @Override
    @Transactional(readOnly = true)
    public Optional<EmpresaDTO> findById(Long id) {
        return ServiceConvertionHelper.oneToOptionalDto(empresaRepository.findById(id), EmpresaDTO.class);
    }

    @Override
    public Optional<List<EmpresaDTO>> filtroEmpresa(String provincia, String canton, Float importe) {
        return ServiceConvertionHelper.findList(empresaRepository.filtroEmpresa(provincia, canton, importe), EmpresaDTO.class);
    }

}
