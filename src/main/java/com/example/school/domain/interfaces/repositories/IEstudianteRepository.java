package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {
   // Estudiante findByCodigoAndPassword(String Codigo, String Password);
}
