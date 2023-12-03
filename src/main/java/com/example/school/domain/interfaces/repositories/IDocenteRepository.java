package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.Docente;
import com.example.school.domain.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteRepository extends JpaRepository<Docente, Long> {
  //  Docente findByCodigoAndPassword(String Codigo, String Password);
}
