package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEstudiante;

    @OneToOne
    @JoinColumn(name = "IdPersona", nullable = false)
    private Persona Persona;

    private String Codigo;
    private String Password;

    // Constructor
    public Estudiante(Persona Persona, String Codigo, String Password) {
        //this.IdEstudiante = IdEstudiante;
        this.Persona = Persona;
        this.Codigo = Codigo;
        this.Password = Password;
    }

    // Default constructor required by Jakarta Persistence
    public Estudiante() {
    }
}
