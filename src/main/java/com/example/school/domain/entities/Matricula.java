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
@Table(name = "matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMatricula;

    @ManyToOne
    @JoinColumn(name = "IdEstudiante", nullable = false)
    private Estudiante Estudiante;

    @ManyToOne
    @JoinColumn(name = "IdGradoSeccion", nullable = false)
    private GradoSeccion GradoSeccion;

    private int Anho;
    private String Observacion;

    // Constructor
    public Matricula( Estudiante Estudiante, GradoSeccion GradoSeccion, int Anho, String Observacion) {
      //  this.IdMatricula = IdMatricula;
        this.Estudiante = Estudiante;
        this.GradoSeccion = GradoSeccion;
        this.Anho = Anho;
        this.Observacion = Observacion;
    }

    // Default constructor required by Jakarta Persistence
    public Matricula() {
    }
}
