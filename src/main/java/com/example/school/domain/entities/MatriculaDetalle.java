package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "matricula_detalle")
public class MatriculaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDetalle;

    @ManyToOne
    @JoinColumn(name = "IdCronogramaCurso", nullable = false)
    private CronogramaCurso CronogramaCurso;

    private BigDecimal Puntuacion;
    private String Observacion;

    // Constructor
    public MatriculaDetalle( CronogramaCurso CronogramaCurso, BigDecimal Puntuacion, String Observacion) {
     //   this.IdDetalle = IdDetalle;
        this.CronogramaCurso = CronogramaCurso;
        this.Puntuacion = Puntuacion;
        this.Observacion = Observacion;
    }

    // Default constructor required by Jakarta Persistence
    public MatriculaDetalle() {
    }
}
