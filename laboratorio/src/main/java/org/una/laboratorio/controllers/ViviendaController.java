/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.una.laboratorio.services.IViviendaService;


@RestController
@RequestMapping("/viviendas")
public class ViviendaController {
    
    @Autowired
    private IViviendaService viviendaService;
    
    @GetMapping()
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try{
            return new ResponseEntity(viviendaService.findAll(), HttpStatus.OK);
        }catch(Exception ex){
            return new ResponseEntity<>(ex.getClass(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(value = "id") Long id) {
        try{
            return new ResponseEntity<>(viviendaService.findById(id), HttpStatus.OK);
        }catch(Exception ex){
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("filtro/{provincia}/{canton}/{terraza}/{piscina}/{jardin}/{garaje}")
    public ResponseEntity<?> filtroVivienda(@PathVariable(value = "provincia") String provincia,
                                            @PathVariable(value = "canton") String canton,
                                            @PathVariable(value = "terraza") boolean terraza,
                                            @PathVariable(value = "piscina") boolean piscina,
                                            @PathVariable(value = "jardin") boolean jardin,
                                            @PathVariable(value = "garaje") boolean garaje) {
        try{
            return new ResponseEntity<>(viviendaService.filtroVivienda(provincia, canton, terraza, piscina, jardin, garaje), HttpStatus.OK);
        }catch(Exception ex){
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("find/{superficie}/{numH}/{numBanos}/{terraza}/{piscina}/{jardin}/{garaje}")
    public ResponseEntity<?> filterBySuperficieNumHabitacionesNumBanosTerrazaPiscinaJardinGaraje(
                                            @PathVariable(value = "superficie") Float superficie,
                                            @PathVariable(value = "numH") Integer numH,
                                            @PathVariable(value = "numBanos") Integer numBanos,
                                            @PathVariable(value = "terraza") boolean terraza,
                                            @PathVariable(value = "piscina") boolean piscina,
                                            @PathVariable(value = "jardin") boolean jardin,
                                            @PathVariable(value = "garaje") boolean garaje) {
        try{
            return new ResponseEntity<>(viviendaService.findBySuperficieNumHabitacionesNumBanosTerrazaPiscinaJardinGaraje
                                       (superficie, numH, numBanos, terraza, piscina, jardin, garaje), HttpStatus.OK);
        }catch(Exception ex){
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
