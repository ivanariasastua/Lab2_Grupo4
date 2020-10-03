/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.una.laboratorio.entities.Vivienda;

public interface IViviendaRepository extends JpaRepository<Vivienda, Long>{
    
}
