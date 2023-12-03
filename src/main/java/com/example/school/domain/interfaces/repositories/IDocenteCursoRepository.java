package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.DocenteCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteCursoRepository extends JpaRepository<DocenteCurso, Long> {
}
