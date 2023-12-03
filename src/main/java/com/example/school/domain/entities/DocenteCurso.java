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
@Table(name = "docente_curso")
public class DocenteCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDocenteCurso;

    @ManyToOne
    @JoinColumn(name = "IdDocente", nullable = false)
    private Docente Docente;

    @ManyToOne
    @JoinColumn(name = "IdCronogramaCurso", nullable = false)
    private CronogramaCurso CronogramaCurso;

    private String Observacion;

    // Constructor
    public DocenteCurso(Docente Docente, CronogramaCurso CronogramaCurso, String Observacion) {
      //  this.IdDocenteCurso = IdDocenteCurso;
        this.Docente = Docente;
        this.CronogramaCurso = CronogramaCurso;
        this.Observacion = Observacion;
    }

    // Default constructor required by Jakarta Persistence
    public DocenteCurso() {
    }
}
