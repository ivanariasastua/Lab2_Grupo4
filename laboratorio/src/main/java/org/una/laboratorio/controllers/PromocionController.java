/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.controllers;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.una.laboratorio.services.IPromocionService;

/**
 *
 * @author cordo
 */
@RestController
@RequestMapping("/promociones")
public class PromocionController {
    
    @Autowired
    private IPromocionService promocionService;
    
    @GetMapping()
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            return new ResponseEntity<>(promocionService.findAll(), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(value = "id") Long id) {
        try {
            return new ResponseEntity<>(promocionService.findById(id), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("find/{provincia}/{canton}/{distrito}/{fechaInicio}/{fechaFinal}")
    public ResponseEntity<?> findByProvinciaCantonDistritoFechaRegistro(@PathVariable(value = "provincia") String provincia,
                                                                        @PathVariable(value = "canton") String canton,
                                                                        @PathVariable(value = "distrito") String distrito,
                                                                        @PathVariable(value = "fechaInicio") Date fechaInicio,
                                                                        @PathVariable(value = "fechaFinal") Date fechaFinal) {
        try {
            return new ResponseEntity<>(promocionService.findByProvinciaCantonDistritoFechaRegistro(provincia, canton, distrito, fechaInicio, fechaFinal), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("filro/{provincia}/{canton}/{importe}")
    public ResponseEntity<?> filtroPromocion(@PathVariable(value = "provincia") String provincia,
                                             @PathVariable(value = "canton") String canton,
                                             @PathVariable(value = "importe") Float importe) {
        try {
            return new ResponseEntity<>(promocionService.filtroPromocion(provincia, canton, importe), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
