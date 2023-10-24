package com.example.demoApi3.repository;

import com.example.demoApi3.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

List<Aluno> findByNome(String nome);

List<Aluno> findByAltura(Double altura);

@Query("select a from Aluno a where a.nome like %?1%")
List<Aluno> findByParteNome(String parteNome);

@Query("select a from Aluno a where a.ra > ?1")
    List<Aluno>findbyRaMaiorQue(int ra);

@Query("select a from Aluno a where a.altura < ?1")
    List<Aluno>findbyAlturaMenorQue(double altura);

@Query("select a from Aluno a where a.nome like %?1% and a.ra > ?2")
List<Aluno>findByNomeRa(String nome,int ra);

@Query("select a from Aluno a where a.nome like %?1% and a.altura < ?2")
List<Aluno>findbyNomeAltura(String nome, double altura);
}
