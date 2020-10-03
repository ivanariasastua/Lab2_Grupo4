/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author cordo
 */
@Entity
@Table(name = "lab2_Empresas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Empresa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100)
    private String nombre;
    
    @Column(length = 15)
    private String tipo;
    
    @Column(length = 100)
    private String direccion;
    
    @Column
    private String telefono;
    
    @Column
    private String fax;
    
    @Column
    private String correo_electronico;
    
    @Column
    private boolean estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private List<Contrato> promocionesEmpresas;
    
    @PrePersist
    public void prePersist() {
        estado = true;
    }
    
}
