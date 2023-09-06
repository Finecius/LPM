import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       ArrayList<Produto> a = new ArrayList<Produto>();
       Produto l= new Livros(13,"Comunismo",69,"Marx");
       Produto c = new CD(20,"Cigrilo",49,5);
       Produto d=new DVD(19,"Djamba",23,120);
       Produto l1 = new Livros(22,"Brasil",17,"Bolsonaro");
       Produto d1 = new DVD(39,"Learning how to code",120,60);

       Scanner s = new Scanner(System.in);
       a.add(l);
       a.add(c);
       a.add(d);
       a.add(l1);
       a.add(d1);
       for(Produto i:a){
           System.out.println(i.toString());
           System.out.println("---------------");
       }
       int sc,b=0;
       do {
           System.out.println("Digite um código de um produto(0 para encerrar o programa): ");
           sc = s.nextInt();
           for(Produto i:a){
               if (i.getCodigo()==sc) {
                   System.out.println(i.toString());
                   b++;
               }
           }
           if(b==0)
               System.out.println("Código não encontrado");
           else
               b=0;
       }while(sc!=0);
        do {
            System.out.println("BEM VINDO A CONSULTA DE PRODUTOS\n-------------------\n" +
                    "(1)Livros\n(2)CDs\n(3)DVDs\n(0)Encerrar\n");

            sc = s.nextInt();
            for(Produto i:a){
                if (sc==1) {
                    if(i instanceof Livros)
                    System.out.println(i.toString());
                }
                if (sc==2) {
                    if(i instanceof CD)
                        System.out.println(i.toString());
                }
                if (sc==3) {
                    if(i instanceof DVD)
                        System.out.println(i.toString());
                }
            }

        }while(sc!=0);
    }
}