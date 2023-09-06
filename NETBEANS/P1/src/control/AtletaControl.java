/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Atleta;

/**
 *
 * @author aluno
 */
public class AtletaControl {
    
    ArrayList<Atleta> Lista;

    public AtletaControl() {
    
    Lista = new ArrayList();
    }

   public void Adicionar(int codigo,String nome, double peso,double altura,int idade){
       
       Atleta a = new Atleta(codigo,nome,peso,altura,idade);
       Lista.add(a);
}
    
    
 public double MediaPesos(){
     int id = 0;
     double Media = 0;
     for(Atleta a: Lista){
     Media += a.getPeso();
     id++;
 }  
    return (Media/id);
    
 }
 
 public int IdadesMenores(){
     
     int menores = 0;
     for(Atleta b: Lista){
         if(b.getIdade()<18){
             menores++;
        }
    } 
    return menores;
 }
 
 public int IdadesMaiores(){
     
     int maiores = 0;
     for(Atleta b: Lista){
         if(b.getIdade()>=18){
             maiores++;
        }
     }
    return maiores;
 }
 
 public String AtletaMaisAlto(){
     double Altura = 0;
     String MaisAlto = "";
     for(Atleta c: Lista){
         if(c.getAltura()>Altura){
             Altura = c.getAltura();
             MaisAlto = c.getNome();
         }
     }
     return MaisAlto;
 }
 
 public String Listagem(){
     String Nomes = "";
     for(Atleta d: Lista){
         Nomes += (", " + d.getNome());
     }
     return Nomes;
 }
 public String Busca(String nome){
     int t=0;
        String nomes ="";
         for (Atleta i : Lista) {

             if (i.getNome().toUpperCase().contains(nome.toUpperCase())) {
                
                 t++;
                 nomes += ("nome: "+i.getNome()+" Codigo: "+i.getCodigo()+" Altura: "+i.getAltura()+ " Peso: "+i.getPeso()+" Idade: "+i.getIdade()+".\n");
                 
             }
           
         }
           if (t == 0) {
                 return ("Não há cadastros com esse nome!");
             }
          return nomes;

}   public String Buscacodigo(int codigo){
     int t=0;
        String nomes ="";
         for (Atleta i : Lista) {

             if (i.getCodigo() == codigo) {
                    
                 t++;
                 nomes += ("nome: "+i.getNome()+" Codigo: "+i.getCodigo()+" Altura: "+i.getAltura()+ " Peso: "+i.getPeso()+" Idade: "+i.getIdade()+".\n");
                 
             }
           
         }
           if (t == 0) {
                 return ("Não há cadastros com esse código!");
             }
          return nomes;

}
 public String Buscapeso(double peso){
     int t=0;
        String nomes ="";
         for (Atleta i : Lista) {

             if (i.getPeso() == peso) {
                    
                 t++;
                 nomes += ("nome: "+i.getNome()+" Codigo: "+i.getCodigo()+" Altura: "+i.getAltura()+ " Peso: "+i.getPeso()+" Idade: "+i.getIdade()+".\n");
                 
             }
           
         }
           if (t == 0) {
                 return ("Não há cadastros com esse peso!");
             }
          return nomes;

}
  public String Buscaaltura(double altura){
     int t=0;
        String nomes ="";
         for (Atleta i : Lista) {

             if (i.getAltura() == altura) {
                    
                 t++;
                 nomes += ("nome: "+i.getNome()+" Codigo: "+i.getCodigo()+" Altura: "+i.getAltura()+ " Peso: "+i.getPeso()+" Idade: "+i.getIdade()+".\n");
                 
             }
           
         }
           if (t == 0) {
                 return ("Não há cadastros com essa altura!");
             }
          return nomes;

}
   public String Buscaidade(int idade){
     int t=0;
        String nomes ="";
         for (Atleta i : Lista) {

             if (i.getIdade() == idade) {
                    
                 t++;
                 nomes += ("nome: "+i.getNome()+" Codigo: "+i.getCodigo()+" Altura: "+i.getAltura()+ " Peso: "+i.getPeso()+" Idade: "+i.getIdade()+".\n");
                 
             }
           
         }
           if (t == 0) {
                 return ("Não há cadastros com essa idade!");
             }
          return nomes;

}
   
   public String Excluir(int codigo){
     String dados="";
       int t=0;
       for(Atleta i:Lista){
           if(i.getCodigo()==codigo){
                dados += ("nome: "+i.getNome()+" Codigo: "+i.getCodigo()+" Altura: "+i.getAltura()+ " Peso: "+i.getPeso()+" Idade: "+i.getIdade()+".\n");
               t++;
               Lista.remove(i);
               break;
           }
       }
       if(t==0){
       return("Não ha cadastros com este código!");
               }
         return(dados+"foi excluído com sucesso!");
   
   }
}
