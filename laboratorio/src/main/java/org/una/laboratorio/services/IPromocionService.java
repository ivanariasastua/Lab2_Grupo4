/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.una.laboratorio.dto.PromocionDTO;

/**
 *
 * @author cordo
 */
public interface IPromocionService {
    
    public Optional<List<PromocionDTO>> findAll();

    public Optional<PromocionDTO> findById(Long id);
    
    public Optional<List<PromocionDTO>> filtroPromocion(String provincia, String canton, Float importe);
    
    public Optional<List<PromocionDTO>> findByProvinciaCantonDistritoFechaRegistro(String provincia, String canton, String distrito,
                                                                                   Date fechaInicio, Date fechaFinal);

}