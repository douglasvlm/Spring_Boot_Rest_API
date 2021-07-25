package com.projeto.douglas.repository;

import com.projeto.douglas.model.Academic_Ann;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicRepository extends JpaRepository<Academic_Ann, Long> {
}
