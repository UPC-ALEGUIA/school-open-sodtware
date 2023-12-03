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
@Table(name = "cronograma_curso")
public class CronogramaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCronogramaCurso;

    @ManyToOne
    @JoinColumn(name = "IdCronograma", nullable = false)
    private Cronograma Cronograma;

    @ManyToOne
    @JoinColumn(name = "IdCurso", nullable = false)
    private Curso Curso;

    private String Codigo;
    private String Descripcion;

    // Constructor
    public CronogramaCurso(Cronograma Cronograma, Curso Curso, String Codigo, String Descripcion) {
        //this.IdCronogramaCurso = IdCronogramaCurso;
        this.Cronograma = Cronograma;
        this.Curso = Curso;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
    }

    // Default constructor required by Jakarta Persistence
    public CronogramaCurso() {
    }
}
