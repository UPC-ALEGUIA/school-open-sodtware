package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.MatriculaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaDetalleRepository extends JpaRepository<MatriculaDetalle, Long> {
}
