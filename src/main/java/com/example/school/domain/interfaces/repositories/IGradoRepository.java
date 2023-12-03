package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradoRepository extends JpaRepository<Grado,Long> {
}
