import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> l = new ArrayList();
        CPF c1 = new CPF("Renato","Rua A, 89",1999945,4098213);
        CPF c2 = new CPF("Alberto","Rua B, 99",123213,4072332);
        CNPJ c3 = new CNPJ("Airlines LATAM","Rua Del Rey",23332123,123132318,"LATAM");
        CNPJ c4 = new CNPJ("Shoes ALL STAR LTDA.","Rua 32",1231231,445678312,"ALL STAR");
        Eletrico p1 = new Eletrico(32,"Tomada",20,1);
        Alvenaria p2 = new Alvenaria(40,"Mesa",400,5);
        Alvenaria p3 = new Alvenaria(60,"Tabua",20,1);
        Hidraulico p4 = new Hidraulico(50,"Mangueira",12,1);
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);

        ArrayList<Cliente> l2 = new ArrayList<>();

        l2.add(c1);
        l2.add(c2);
        l2.add(c3);
        l2.add(c4);

        for (Produto i : l){
            if(i instanceof Eletrico){
                i.setPreco(i.getPreco()-(i.getPreco()*0.2));
            }
            if (i instanceof Alvenaria) {
                if (i.getPreco() < 100)
                    i.mostrarDados();
            }
            else
                i.mostrarDados();
        }


        for (Cliente i: l2) {

        if('A'==(i.getNome().charAt(0))){
i.mostrarDados();
        }

        }
    }
}
