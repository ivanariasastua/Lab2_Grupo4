/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.laboratorio.entities.Empresa;

/**
 *
 * @author cordo
 */
public interface IEmpresaRepository extends JpaRepository<Empresa, Long>{
    
    @Query("SELECT e FROM Empresas " +
           "JOIN e.promociones pro pro.empresa.id = e.id " +
           "WHERE UPPER(pro.promocion.poblacion.provincia) = UPPER(:provicia) and " +
           "UPPER(pro.promocion.poblacion.canton) = UPPER(:canton) and " +
           "and pro.importe >= :importe")
    public List<Empresa> filtroEmpresa(
        @Param("provincia") String provicia,
        @Param("canton") String canton,
        @Param("importe") Float importe
    );
}
