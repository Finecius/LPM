package com.example.demoApi3.repository;

import com.example.demoApi3.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {
}
