package com.example.school;

import com.example.school.domain.entities.Persona;
import com.example.school.domain.interfaces.services.IPersonaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SchoolApplicationTests {
    @Autowired
    IPersonaService personaService;

    @Test
    void contextLoads() {
    }

    @Test
    void  crearPersona(){

        Persona saveData = new Persona("String Apellidos", "String Nombres", "String Documento", 'M',
        "String Email", "String Telefono", new Date(), "String Direccion");
        Persona saveResult = personaService.Create(saveData);

        System.out.println(saveResult);
    }
}
