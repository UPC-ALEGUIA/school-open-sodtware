package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.CronogramaCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICronogramaCursoRepository extends JpaRepository<CronogramaCurso, Long> {
}
