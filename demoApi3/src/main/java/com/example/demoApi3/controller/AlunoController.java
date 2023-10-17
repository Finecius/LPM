package com.example.demoApi3.controller;

import com.example.demoApi3.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoApi3.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alrepo;

    @GetMapping("/todos")
    public List<Aluno> buscarTodosAlunos(){
        return alrepo.findAll();
    }


    @GetMapping("/todos/ra/{ra}")
    public Optional<Aluno> buscarPorRa(@PathVariable("ra") int ra){
        return  alrepo.findById(ra);
    }

}

