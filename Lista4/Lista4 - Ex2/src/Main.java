import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        ArrayList <Imovel> casas = new ArrayList <Imovel> ();
        Imovel casa1 = new Novo(20000,"Rua 1",3000);
        Imovel casa2 = new Novo(50000,"Rua Nobre",3000);
        Imovel casa3 = new Antigo(25000,"Rua Nobre",5000);
        Imovel casa4 = new Antigo(10000,"Rua 1",2000);

        casas.add(casa1);
        casas.add(casa2);
        casas.add(casa3);
        casas.add(casa4);

        for(Imovel I:casas){
            if(I instanceof Novo)
                I.imprimeDados();
        }


    }
}