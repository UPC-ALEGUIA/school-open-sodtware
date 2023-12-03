package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "grado_seccion")
public class GradoSeccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdGradoSeccion;

    @ManyToOne
    @JoinColumn(name = "IdGrado", nullable = false)
    private Grado Grado;

    @ManyToOne
    @JoinColumn(name = "IdSeccion", nullable = false)
    private Seccion Seccion;

    private String Descripcion;

    // Constructor
    public GradoSeccion( Grado Grado, Seccion Seccion, String Descripcion) {
       // this.IdGradoSeccion = IdGradoSeccion;
        this.Grado = Grado;
        this.Seccion = Seccion;
        this.Descripcion = Descripcion;
    }

    // Default constructor required by Jakarta Persistence
    public GradoSeccion() {
    }
}
