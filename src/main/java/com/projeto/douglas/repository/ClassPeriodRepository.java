package com.projeto.douglas.repository;
import com.projeto.douglas.model.ClassPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassPeriodRepository extends JpaRepository<ClassPeriod, Long> {
}
