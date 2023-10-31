package com.example.ProjetoFinal.controller;

import com.example.ProjetoFinal.model.Cliente;
import com.example.ProjetoFinal.model.Produto;
import com.example.ProjetoFinal.repository.ProdutoRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository prrepo;

    @PostMapping("/cadastrar")
        public void CadastrarProduto(@RequestBody Produto pd){
            prrepo.save(pd);
        }


    @GetMapping("/todos")
        public List<Produto> buscarTodosProdutos(){
            return prrepo.findAll();

    }

    @GetMapping("/todos/codigo/{codigo}")
    public Optional<Produto> buscarPorCodigo(@PathVariable ("codigo") int codigo){
        return prrepo.findById(codigo);
    }


    @GetMapping("/todos/marca/{marca}")
    public List<Produto> buscarPorMarca(@PathVariable ("marca") String marca){
        return prrepo.findByMarca(marca);
    }

    @GetMapping("/todos/inicialDescricao/{inicial}")
    public List<Produto> buscarPorInicial(@PathVariable ("inicial") String inicial){
        return prrepo.findByInicialDescricao(inicial);
    }

    @GetMapping("/todos/MaisBaratos/{preco}")
    public List<Produto> buscarPorMaisBaratos(@PathVariable ("preco") double preco){
    return prrepo.findByMaisBarato(preco);
    }

    @GetMapping("/todos/buscarMarcaPreco/{marca}/{preco}")
    public List<Produto> buscarPorMarcaPreco(@PathVariable ("marca") String marca, @PathVariable ("preco") double preco){
        return prrepo.findByMarcaPreco(marca, preco);
    }

    @DeleteMapping("/remover")
    public void removerProduto(@RequestBody Produto pd){
        prrepo.delete(pd);
    }

    @DeleteMapping("/remover/codigo/{codigo}")
    public void removerProdutoPorCodigo(@PathVariable("codigo") int codigo){
        prrepo.deleteById(codigo);
    }

    @PutMapping("/atualizar")
    public void atualizarProduto(@RequestBody Produto pd){
        prrepo.save(pd);
    }

}
