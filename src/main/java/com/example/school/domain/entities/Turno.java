package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "turno")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdTurno;

    private String Descripcion;

    // Constructor
    public Turno(String Descripcion) {
       // this.IdTurno = IdTurno;
        this.Descripcion = Descripcion;
    }

    // Default constructor required by Jakarta Persistence
    public Turno() {
    }
}
