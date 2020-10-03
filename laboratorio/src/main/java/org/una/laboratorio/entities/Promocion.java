/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.entities;

import java.util.Date;
import java.util.List;
import javassist.bytecode.ByteArray;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Ivan Josué Arias Astua
 */
@Entity
@Table(name = "lab2_Promociones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Promocion {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "codigo_interno", length = 15, unique = true)
    private String codigoInterno;
    
    @Column(length = 100)
    private String nombre;
    
    @Column(length = 100)
    private String ubicacion;
    
    @Lob
    @Column(columnDefinition="MEDIUMBLOB")
    private Byte[] plano;
    
    @Column(name = "fecha_registro", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date fechaRegistro;
    
    @Column
    private Boolean estado;

    @Column(name = "fecha_modificacion")
    @Setter(AccessLevel.NONE)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "promocion")
//    private List<Vivienda> viviendas;
}