package com.example.demoApi3.repository;

import com.example.demoApi3.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

List<Aluno> findByNome(String nome);

List<Aluno> findByAltura(Double altura);
}
