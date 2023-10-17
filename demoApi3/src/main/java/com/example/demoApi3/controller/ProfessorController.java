package com.example.demoApi3.controller;

import com.example.demoApi3.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoApi3.repository.ProfessorRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiProfessor")
public class ProfessorController {

    @Autowired
    ProfessorRepository prfrepo;

    @GetMapping("/todos")
    public List<Professor> buscarTodosProfessores(){
        return prfrepo.findAll();
    }


    @GetMapping("/todos/ProfRa/{ProfRa}")
    public Optional<Professor> buscarPorProfRa(@PathVariable("ProfRa") int ProfRa){
        return prfrepo.findById(ProfRa);
    }

    @GetMapping("/todos/nome/{nome}")
    public List<Professor> buscarPorNome(@PathVariable("nome") String nome){return prfrepo.findByNome(nome);}

    @GetMapping("/todos/altura/{altura}")
    public List<Professor> buscarPorAltura(@PathVariable("altura") Double altura){return prfrepo.findByAltura(altura);}

    @PostMapping("/inserir")
    public void inserirProfessor(@RequestBody Professor prof){
        prfrepo.save(prof);
    }
}

