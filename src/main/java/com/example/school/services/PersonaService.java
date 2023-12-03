package com.example.school.services;

import com.example.school.domain.entities.Persona;
import com.example.school.domain.interfaces.repositories.IPersonaRepository;
import com.example.school.domain.interfaces.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    IPersonaRepository personaRepository;

    @Override
    public Persona Create(Persona persona) {
        return personaRepository.save(persona);
    }
}
