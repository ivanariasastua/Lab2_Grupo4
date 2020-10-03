/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Ivan Josué Arias Astua
 */
@Entity
@Table(name = "lab2_Poblaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Poblacion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 20)
    private String provincia;
    
    @Column(length = 20)
    private String canton;
    
    @Column(length = 20)
    private String distrito;
    
    @Column(name = "codigo_postal", length = 5)
    private String codigoPostal;
    
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "poblacion")
    private List<Promocion> promociones;
}
