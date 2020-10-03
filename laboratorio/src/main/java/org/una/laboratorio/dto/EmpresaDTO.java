/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author cordo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class EmpresaDTO {
    
    private Long id;
    private String nombre;
    private String tipo;
    private String direccion;
    private String telefono;
    private String fax;
    private double correo_electronico;
    private boolean estado;
}
