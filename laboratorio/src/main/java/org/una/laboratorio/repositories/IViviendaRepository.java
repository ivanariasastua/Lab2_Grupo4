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
import org.una.laboratorio.entities.Vivienda;

public interface IViviendaRepository extends JpaRepository<Vivienda, Long>{
    
    @Query("SELECT v FROM Vivienda v " +
           "JOIN v.promocion p ON v.promocion.id = p.id " +
           "WHERE UPPER(p.poblacion.provincia) = UPPER(:provincia) and " +
           "UPPER(p.poblacion.canton) = UPPER(:canton) and " +
           "v.terraza = :terraza and v.piscina = :piscina and v.jardin = :jardin and v.garaje = :garaje"
    )
    public List<Vivienda> filtroVivienda(
        @Param("provincia") String provicia, 
        @Param("canton") String canton,
        @Param("terraza") boolean terraza,
        @Param("piscina") boolean piscina, 
        @Param("jardin") boolean jardin,
        @Param("garaje") boolean garaje
    );
    
    @Query("SELECT v FROM Vivienda v " +
           "WHERE v.superficie >= :superficie and v.numHabitaciones >= :numH and v.numBanos >= :numB and "+
           "v.terraza = :terraza and v.piscina = :piscina and v.jardin = :jardin and v.garaje = :garaje"
    )
    public List<Vivienda> filterBySuperficieNumHabitacionesNumBanosTerrazaPiscinaJardinGaraje(
        @Param("superficie") Float superficie,
        @Param("numH") Integer numH,
        @Param("numB") Integer numBanos,
        @Param("terraza") boolean terraza,
        @Param("piscina") boolean piscina, 
        @Param("jardin") boolean jardin,
        @Param("garaje") boolean garaje
    );
}
