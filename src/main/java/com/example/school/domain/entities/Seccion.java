package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "seccion")
public class Seccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdSeccion;

    private String Descripcion;

    // Constructor
    public Seccion(String Descripcion) {
       // this.IdSeccion = IdSeccion;
        this.Descripcion = Descripcion;
    }

    // Default constructor required by Jakarta Persistence
    public Seccion() {
    }
}
