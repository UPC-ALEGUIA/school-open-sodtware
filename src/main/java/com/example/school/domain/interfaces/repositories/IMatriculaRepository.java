package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
}
