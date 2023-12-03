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
@Table(name = "matricula_asistencia")
public class MatriculaAsistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAsistencia;

    @ManyToOne
    @JoinColumn(name = "IdDetalle", nullable = false)
    private MatriculaDetalle MatriculaDetalle;

    @ManyToOne
    @JoinColumn(name = "IdEstudiante", nullable = false)
    private Estudiante Estudiante;

    private int Falta;
    private String Observacion;

    // Constructor
    public MatriculaAsistencia( MatriculaDetalle MatriculaDetalle, Estudiante Estudiante, int Falta, String Observacion) {
     //   this.IdAsistencia = IdAsistencia;
        this.MatriculaDetalle = MatriculaDetalle;
        this.Estudiante = Estudiante;
        this.Falta = Falta;
        this.Observacion = Observacion;
    }

    // Default constructor required by Jakarta Persistence
    public MatriculaAsistencia() {
    }
}
