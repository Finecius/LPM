package com.example.demoApi3.repository;

import com.example.demoApi3.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository <Disciplina, Integer> {

    List<Disciplina> findByNome(String nome);

    List<Disciplina> findBySigla(String sigla);

    List<Disciplina> findByCargaH(int cargaH);

    @Query("select a from Disciplina a where a.sigla like %?1% and a.codigo > ?2")
    List<Disciplina> findBySiglaCodigo(String sigla, int codigo);

    @Query("select a from Disciplina a where a.nome like %?1% and a.codigo < ?2")
    List<Disciplina> findByNomeCodigo(String nome, int codigo);

    @Query("select a from Disciplina a where a.sigla like %?1% and a.nome like %?2%")
    List<Disciplina>findBySiglaNome(String sigla, String nome);
}
