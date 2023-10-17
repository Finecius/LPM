package com.example.demoApi3.repository;

import com.example.demoApi3.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
