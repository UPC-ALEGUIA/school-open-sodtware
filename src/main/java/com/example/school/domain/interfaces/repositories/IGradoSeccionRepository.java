package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.GradoSeccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradoSeccionRepository extends JpaRepository<GradoSeccion, Long> {
}
