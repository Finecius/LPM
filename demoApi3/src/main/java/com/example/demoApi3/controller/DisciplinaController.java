package com.example.demoApi3.controller;

import com.example.demoApi3.model.Disciplina;
import com.example.demoApi3.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apIDisciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaRepository dscrepo;

    @GetMapping("/todos")
    public List<Disciplina> buscarTodasDisciplinas(){
        return dscrepo.findAll();
    }

    @GetMapping("/todos/codigo/{codigo}")
    public Optional<Disciplina> buscarPorCodigo(@PathVariable("codigo") int codigo){
        return dscrepo.findById(codigo);
    }

}
