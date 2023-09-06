import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> lista = new ArrayList<ContaCorrente>();

        ContaCorrente c1 = new ContaCorrente(233,"Ed");
        c1.deposita(100);
        ContaCorrida C = new ContaCorrida(200,"Erderson",100);
        ContaJunior CJ = new ContaJunior(900,"Renato",9);
        lista.add(c1);
        lista.add(C);
        lista.add(CJ);

        for (ContaCorrente c2: lista){
            c2.deposita(100);
            if(c2 instanceof ContaCorrida) {
                ContaCorrida l = (ContaCorrida) c2;
                l.add();
            }
            if (c2 instanceof ContaJunior){
                ContaJunior J = (ContaJunior) c2;
                System.out.println(J.getIdade());
            }
            System.out.println("----------------------------");
        }
    }
}