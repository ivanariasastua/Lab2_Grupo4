/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "lab2_Viviendas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vivienda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="promocion")
    @JsonBackReference
    private Promocion promocion;
    
    @Column(name = "superficie")
    private Float superficie;
    
    @Column(name = "numero_habitaciones")
    private Integer numHabitaciones;
    
    @Column(name = "numero_banos")
    private Integer numBanos;
    
    @Lob
    @Column(columnDefinition="MEDIUMBLOB")
    private Byte[] plano;
    
    @Lob
    @Column(columnDefinition="MEDIUMBLOB")
    private Byte[] foto;
    
    @Column(name = "precio")
    private Float precio;
    
    @Column(name = "terraza")
    private Boolean terraza;
    
    @Column(name = "jardin")
    private Boolean jardin;
    
    @Column(name = "piscina")
    private Boolean piscina;
    
    @Column(name = "garaje")
    private Boolean garaje;
    
    @Column(name = "estado")
    private Boolean estado;
    
    @PrePersist
    public void prePersist(){
        
    }
    
    @PreUpdate
    public void preUpdate() {
        
    }
}
