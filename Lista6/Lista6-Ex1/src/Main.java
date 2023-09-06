import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empregado> l = new ArrayList<>();

        Assalariado a = new Assalariado("Vinicius","César","40839854889",300);
        Assalariado b = new Assalariado("Gabriel","Gol","32345916866",9000);
        Comissionado c = new Comissionado("Mateus","Mateus","21312312313",10000,0.01);
        Comissionado d = new Comissionado("Enrique","Machado","21312445466",2345,0.9);
        Horista e = new Horista("Cleber","Souza","52893524372",70,45);
        Horista f = new Horista("Renato","Garfield","0980888782344",10,12.5);

        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        l.add(e);
        l.add(f);

        for(Empregado i:l){
            i.mostraDados();
            System.out.println(" Total das vendas realizadas: "+i.vencimento()+"\n");
        }
    }
}