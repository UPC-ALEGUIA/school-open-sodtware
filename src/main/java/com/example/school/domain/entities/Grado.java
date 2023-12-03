package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "grado")
public class Grado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdGrado;

    private String Descripcion;

    // Constructor
    public Grado( String Descripcion) {
    //    this.IdGrado = IdGrado;
        this.Descripcion = Descripcion;
    }

    // Default constructor required by Jakarta Persistence
    public Grado() {
    }
}
