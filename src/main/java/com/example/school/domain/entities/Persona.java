package com.example.school.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPersona;

    private String Apellidos;
    private String Nombres;
    private String Documento;
    private char Sexo;
    private String Email;
    private String Telefono;
    private Date FechaNacimiento;
    private String Direccion;

    // Constructor
    public Persona(String Apellidos, String Nombres, String Documento, char Sexo,
                   String Email, String Telefono, Date FechaNacimiento, String Direccion) {
      //  this.IdPersona = IdPersona;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Documento = Documento;
        this.Sexo = Sexo;
        this.Email = Email;
        this.Telefono = Telefono;
        this.FechaNacimiento = FechaNacimiento;
        this.Direccion = Direccion;
    }

    // Default constructor required by Jakarta Persistence
    public Persona() {
    }

    public Persona getPersona() {
        return  this;
    }
}
