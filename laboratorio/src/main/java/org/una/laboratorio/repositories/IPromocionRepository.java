/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.repositories;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.laboratorio.entities.Promocion;

/**
 *
 * @author Ivan Josué Arias Astua
 */
public interface IPromocionRepository extends JpaRepository<Promocion, Long>{
    
    @Query("SELECT p FROM Promocion " +
           "JOIN p.empresas emp ON p.id = emp.promocion.id " +
           "WHERE UPPER(p.poblacion.provincia) = UPPER(:provicia) and " +
           "UPPER(p.poblacion.canton) = UPPER(:canton) and " +
           "and emp.importe >= :importe"
    )
    public List<Promocion> filtroPromocion(
        @Param("provincia") String provicia,
        @Param("canton") String canton,
        @Param("importe") Float importe
    ); 
    
    @Query("SELECT p FROM Promocion "+
           "WHERE p.fechaRegistro BETWEEN :fechaInicio and :fechaFinal "+
           "and UPPER(p.poblacion.provincia) = UPPER(:provincia) "+
           "and UPPER(p.poblacion.canto) = UPPER(:canton) "+
           "and UPPER(p.poblacion.provincia) = UPPER(:distrito)"
    )
    public List<Promocion> findByProvinciaCantonDistritoFechaRegistro(
        @Param("provincia") String provicia,
        @Param("canton") String canton,
        @Param("distrito") String distrito,
        @Param("fechaInicio") Date fechaInicio,
        @Param("fechaInicio") Date fechaFinal
    );
}
