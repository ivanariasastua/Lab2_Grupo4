/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class ViviendaDTO {
    private Long id;
    @JsonBackReference
    private PromocionDTO promocion;
    private Float superficie;
    private Integer numHabitaciones;
    private Integer numbanos;
    private Byte[] plano;
    private Byte[] foto;
    private Float precio;
    private Boolean terraza;
    private Boolean jardin;
    private Boolean piscina;
    private Boolean garaje;
}
