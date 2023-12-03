package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCurso;

    private String Descripcion;

    // Constructor
    public Curso(String Descripcion) {
        //this.IdCurso = IdCurso;
        this.Descripcion = Descripcion;
    }

    // Default constructor required by Jakarta Persistence
    public Curso() {
    }
}
