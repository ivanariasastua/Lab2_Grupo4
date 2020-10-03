/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Viviendas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vivienda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne 
    @JoinColumn(name="promocion")
    private Promocion promocion;
    
    @Column(name = "superficie")
    private float supercifie;
    
    @Column(name = "numero_habitaciones")
    private int numHabitaciones;
    
    @Column(name = "numero_banos")
    private int numBanos;
    
    @Lob
    @Column(columnDefinition="MEDIUMBLOB")
    private Byte[] plano;
    
    @Lob
    @Column(columnDefinition="MEDIUMBLOB")
    private Byte[] foto;
    
    @Column(name = "precio")
    private double precio;
    
    @Column(name = "terraza")
    private boolean terraza;
    
    @Column(name = "jardin")
    private boolean jardin;
    
    @Column(name = "piscina")
    private boolean piscina;
    
    @Column(name = "garaje")
    private boolean garaje;
    
    @Column(name = "estado")
    private boolean estado;
    
    @PrePersist
    public void prePersist(){
        
    }
    
    @PreUpdate
    public void preUpdate() {
        
    }
}
