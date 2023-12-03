package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.MatriculaActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaActividadRepository extends JpaRepository<MatriculaActividad, Long> {
}
