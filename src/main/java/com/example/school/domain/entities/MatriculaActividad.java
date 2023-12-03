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
import java.util.Date;

@Data
@Entity
@Table(name = "matricula_actividad")
public class MatriculaActividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "IdDetalle", nullable = false)
    private MatriculaDetalle MatriculaDetalle;

    @ManyToOne
    @JoinColumn(name = "IdActividad", nullable = false)
    private CronogramaActividad CronogramaActividad;

    private BigDecimal Calificacion;
    private Date FechaEntrega;
    private Date FechaEnviado;
    private String Observacion;

    // Constructor
    public MatriculaActividad(MatriculaDetalle MatriculaDetalle, CronogramaActividad CronogramaActividad,
                              BigDecimal Calificacion, Date FechaEntrega, Date FechaEnviado, String Observacion) {
       // this.Id = Id;
        this.MatriculaDetalle = MatriculaDetalle;
        this.CronogramaActividad = CronogramaActividad;
        this.Calificacion = Calificacion;
        this.FechaEntrega = FechaEntrega;
        this.FechaEnviado = FechaEnviado;
        this.Observacion = Observacion;
    }

    // Default constructor required by Jakarta Persistence
    public MatriculaActividad() {
    }
}
