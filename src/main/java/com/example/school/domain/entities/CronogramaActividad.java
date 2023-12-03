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
@Table(name = "cronograma_actividad")
public class CronogramaActividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdActividad;

    @ManyToOne
    @JoinColumn(name = "IdCronogramaCurso", nullable = false)
    private CronogramaCurso CronogramaCurso;

    private String Observacion;

    // Constructor
    public CronogramaActividad(CronogramaCurso CronogramaCurso, String Observacion) {
        //this.IdActividad = IdActividad;
        this.CronogramaCurso = CronogramaCurso;
        this.Observacion = Observacion;
    }

    // Default constructor required by Jakarta Persistence
    public CronogramaActividad() {
    }
}

