/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Ivan Josué Arias Astua
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class PromocionDTO {
    
    private Long id;
    private String codigoInterno;
    private String nombre;
    private Byte[] plano;
    private Date fechaRegistro;
    private Boolean estado;
    private Date fechaModificacion;
    @JsonManagedReference
    private List<ViviendaDTO> viviendas;
    @JsonManagedReference
    private List<ContratoDTO> empresas;
    private PoblacionDTO poblacion;
}
