/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.dto;

import java.util.List;


/**
 *
 * @author Ivan Josué Arias Astua
 */
public class PoblacionDTO {
    private Long id;
    private String provincia;
    private String canton;
    private String distrito;
    private String codigoPostal;
    private List<PromocionDTO> promociones;
}
