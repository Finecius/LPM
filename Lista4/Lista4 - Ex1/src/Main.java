import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Ingresso> ingresso = new ArrayList<Ingresso>();
        Ingresso c =new Comum(30);
        Ingresso c2 = new Comum(20);
        Ingresso c3 = new Comum(40);

        VIP v = new VIP(30,30);
        VIP v2 = new VIP(40,30);
        VIP v3 = new VIP(20,30);
        ingresso.add(c);
        ingresso.add(c2);
        ingresso.add(c3);
        ingresso.add(v);
        ingresso.add(v2);
        ingresso.add(v3);

        for (Ingresso l:ingresso){
            l.imprimeValor();
            System.out.println("---------------");
        }
    }
}