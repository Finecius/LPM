/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author aluno
 */
public class ProdutoControl {
   ArrayList <Produto> Lista;
   
    public ProdutoControl() {
        Lista = new ArrayList();
        
        
    }
   
   public void Cadastrar(int codigo,Double preco,String descricao){
       Produto u1 = new Produto(codigo,preco,descricao);
       Lista.add(u1);
   }
    
    
    
    
    public String exibeMensagem(){
       return ("Tudo new");
    }
    public String cadastroConcluido(){
        return ("produto cadastrado");
    }
       public boolean verificaCadastro(String descricao, int codigo, double preco){
           boolean achou = false;
           for(Produto u1:Lista){
             if(u1.getCodigo() == codigo && u1.getDescricao().equals(descricao) && u1.getPreco() == preco){
            achou=true;
            }
            }
           return achou;
       }
           
}
