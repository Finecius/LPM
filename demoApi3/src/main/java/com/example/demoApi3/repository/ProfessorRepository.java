package com.example.demoApi3.repository;

import com.example.demoApi3.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    List<Professor> findByNome(String nome);

    List<Professor> findByAltura(Double altura);

    @Query("select a from Professor a where a.nome like %?1% and a.altura > ?2")
    List<Professor>findByNomeAltura(String nome, double altura);

    @Query("select a from Professor a where a.nome like %?1% and a.ProfRa < ?2")
    List<Professor>findByNomeProfra(String nome, int ProfRa);


}
