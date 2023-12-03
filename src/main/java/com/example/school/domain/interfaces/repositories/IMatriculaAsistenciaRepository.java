package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.MatriculaAsistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaAsistenciaRepository extends JpaRepository<MatriculaAsistencia, Long> {
}
