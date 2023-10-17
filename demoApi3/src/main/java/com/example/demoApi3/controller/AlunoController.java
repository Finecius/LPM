package com.example.demoApi3.controller;

import com.example.demoApi3.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/todos/nome/{nome}")
    public List<Aluno> buscarPorNome (@PathVariable("nome") String nome)
    {
        return alrepo.findByNome(nome);

    }
    @GetMapping("/todos/altura/{altura}")
    public List<Aluno> buscarPorAltura(@PathVariable("altura") Double altura){

        return alrepo.findByAltura(altura);
    }

    @PostMapping ("/inserir")
    public void inserirAluno(@RequestBody Aluno al)
    {
        alrepo.save(al);
    }


}

