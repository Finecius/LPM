package com.example.demoApi3.repository;

import com.example.demoApi3.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    List<Professor> findByNome(String nome);

    List<Professor> findByAltura(Double altura);


}
