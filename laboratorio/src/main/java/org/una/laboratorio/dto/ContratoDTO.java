/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
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
public class ContratoDTO {
    
    private Long id;
    @JsonBackReference
    private PromocionDTO promocion;
    private EmpresaDTO empresa;
    private Float importe;
    private boolean estado;
    private Date fechaRegistro;
}
