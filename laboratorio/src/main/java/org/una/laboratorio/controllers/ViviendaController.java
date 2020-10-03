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
@RequestMapping("/tramites_registrados")
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
}
