public class    Main {
    public static void main(String[] args) {
        Gerente G = new Gerente("Newton",600,"machista","696969");
        Telefonista T = new Telefonista("Flakespower",700,22);
        Secretaria S = new Secretaria("Santista",10,13);
        G.mostraDados();
        T.mostraDados();
        S.mostraDados();
        G.CalculaBonificacao(G.getSalario());
        System.out.println("Novo salário do Gerente: "+G.getSalario());
        T.CalculaBonificacao(T.getSalario());
        System.out.println("Novo salário do Telefonista: "+T.getSalario());
        S.CalculaBonificacao(S.getSalario());
        System.out.println("Novo salário da Secretária: "+S.getSalario());
    }
}