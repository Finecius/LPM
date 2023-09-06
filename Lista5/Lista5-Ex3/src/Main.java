import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculos> l = new ArrayList();
        Carro a = new Carro("Citroen",150000,0);
        Carro b = new Carro("Etios",200000,100000);
        Moto c = new Moto("F800",300000,2006);
        Moto d = new Moto("Kazavaski",100000,2020);

        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        int carros=0;
        int motos=0;
        double total=0;
        Veiculos Mbarato=c;
        Veiculos Cbarato=a;
        for(Veiculos i:l){
            if(i instanceof Moto){
                Moto m = (Moto) i;
                motos++;
                if(i.getPreco()< Mbarato.getPreco())
                    Mbarato=i;
                if(m.getAno()>=2008){

                    i.setPreco(i.getPreco()+(i.getPreco()*0.1));
                }

            }
            if(i instanceof Carro){
                Carro c1 = (Carro) i;
                carros++;
                if(i.getPreco()< Cbarato.getPreco())
                    Cbarato=i;
                if (c1.getKm()>=100000){
                    i.setPreco(i.getPreco()-(i.getPreco()*0.08));
                }
            }
            i.printDados();
            total+=i.getPreco();
        }
        System.out.println("Total: "+total+"\nTotal de motos: "+motos+"\nTotal de carros: "+carros);
        System.out.println("\n---------------------------------\nMoto mais barata: ");
        Mbarato.printDados();
        System.out.println("\n---------------------------------\nCarro mais barato: ");
        Cbarato.printDados();
    }
}