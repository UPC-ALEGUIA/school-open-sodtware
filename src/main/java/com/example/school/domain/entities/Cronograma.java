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
@Table(name = "cronograma")
public class Cronograma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCronograma;

    @ManyToOne
    @JoinColumn(name = "IdTurno", nullable = false)
    private Turno Turno;

    private int Anho;
    private String Periodo;
    private String Descripcion;

    // Constructor
    public Cronograma(Turno Turno, int Anho, String Periodo, String Descripcion) {
        //this.IdCronograma = IdCronograma;
        this.Turno = Turno;
        this.Anho = Anho;
        this.Periodo = Periodo;
        this.Descripcion = Descripcion;
    }

    // Default constructor required by Jakarta Persistence
    public Cronograma() {
    }
}
