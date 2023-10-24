package com.example.demoApi3.controller;

import com.example.demoApi3.model.Disciplina;
import com.example.demoApi3.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/todos/nome/{nome}")
    public  List<Disciplina> buscarPorNome(@PathVariable("nome") String nome){
        return dscrepo.findByNome(nome);
    }

    @GetMapping("/todos/sigla/{sigla}")
    public List<Disciplina> buscarPorSigla(@PathVariable("sigla") String sigla){
        return dscrepo.findBySigla(sigla);
    }

    @GetMapping("/todos/carga/{cargaH}")
    public List<Disciplina> buscarPorCargaH(@PathVariable("cargaH") int cargaH){
        return dscrepo.findByCargaH(cargaH);
    }
    @PostMapping("/inserir")
    public void inserirDisciplina(@RequestBody Disciplina ds){dscrepo.save(ds);}

    @GetMapping("/todos/siglacodigo/{sigla}/{codigo}")
    public List<Disciplina>buscarSiglaCodigo(@PathVariable("sigla") String sigla,@PathVariable("codigo") int codigo){
       return dscrepo.findBySiglaCodigo(sigla, codigo);
    }
    @GetMapping("/todos/nomecodigo/{nome}/{codigo}")
    public List<Disciplina>buscarNomeCodigo(@PathVariable("nome") String nome,@PathVariable("codigo") int codigo){
        return dscrepo.findByNomeCodigo(nome, codigo);
    }
    @GetMapping("/todos/siglanome/{sigla}/{nome}")
    public List<Disciplina>buscarSiglaNome(@PathVariable("sigla") String sigla,@PathVariable("nome") String nome){
        return dscrepo.findBySiglaNome(sigla, nome);
    }

}
