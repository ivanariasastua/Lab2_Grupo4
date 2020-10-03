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
    
    public Optional<List<ViviendaDTO>> filtroVivienda(String provincia, String canton, boolean terraza, boolean piscina, boolean jardin, boolean garaje);
    
    public Optional<List<ViviendaDTO>> findBySuperficieNumHabitacionesNumBanosTerrazaPiscinaJardinGaraje(
                      Float superficie, Integer numH, Integer numBanos, boolean terraza, boolean piscina, boolean jardin, boolean garaje);
}
