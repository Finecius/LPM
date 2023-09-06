/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    
   ArrayList<Aluno> Lista;

    public AlunoControl() 
    {
    Lista = new ArrayList();
    }
   
    public void Cadastrar(int raTela, String nomeTela)
    {
        Aluno a = new Aluno(raTela, nomeTela);
        Lista.add(a);
        for(Aluno aluno: Lista)
        {
        System.out.println(aluno.getRa());
        System.out.println(aluno.getNome());
        }
       System.out.println("======================\n\n");   
    }
    
    public String mostrar()
    {
        String resultado="";
        for(Aluno al:Lista){
            resultado = resultado.concat(al.getRa()+" "+al.getNome()+"\n");
        }
        return resultado;
    }
    public void excluir(int ra){
        for(Aluno al:Lista){
        if(al.getRa()==ra){
        Lista.remove(al);
        break;
        }
            
        }
    }
}
