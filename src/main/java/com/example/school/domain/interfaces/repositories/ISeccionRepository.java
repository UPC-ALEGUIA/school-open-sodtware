package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISeccionRepository extends JpaRepository<Seccion, Long> {
}
