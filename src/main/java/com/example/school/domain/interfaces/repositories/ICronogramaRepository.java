package com.example.school.domain.interfaces.repositories;

import com.example.school.domain.entities.Cronograma;
import com.example.school.domain.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICronogramaRepository extends JpaRepository<Cronograma, Long> {

}
