package com.example.demoApi3.controller;

import com.example.demoApi3.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}

