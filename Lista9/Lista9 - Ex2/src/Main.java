public class Main {
    public static void main(String[] args) {
      ContaCorrente c1 = new ContaCorrente();
        ContaInvestimento c2 = new ContaInvestimento();
        try {
            c1.depositar(-123);
        }catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(-123)+"\n");
        }
                try {
                    c1.depositar(10000);
                } catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(10000)+"\n");
        }
                c1.calcularSaldo();
                try {
                    c2.depositar(0);
                }catch (ValorInvalidoException e ){
                    System.out.println(e.getMessage(0)+"\n");
        }
                try {
                    c2.depositar(10000);
                }catch (ValorInvalidoException e ){
        System.out.println(e.getMessage(10000)+"\n");
    }
                c2.calcularSaldo();
                try {
                    c1.sacar(-323);
                }catch (ValorInvalidoException e ){
                    System.out.println(e.getMessage(-323)+"\n");
                }catch (SaldoInsuficienteException e){
                    System.out.println(e.getMessage(-323)+"\n");
                }
            try {
                c1.sacar(500);
            }catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(500)+"\n");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage(500)+"\n");
        }
            try {
                c2.sacar(900000);
            }catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(900000)+"\n");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage(900000)+"\n");
        }   try {
            c2.sacar(500);
        } catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(500)+"\n");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage(500)+"\n");
        }   try {
            c1.transferir(-123, c2);
        }catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(-123)+"\n");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage(-123)+"\n");
        }       try {
            c1.transferir(5000, c2);
        }catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(5000)+"\n");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage(5000)+"\n");
        }   try {
            c2.transferir(900000, c1);
        }catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(900000)+"\n");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage(900000)+"\n");
        }   try {
            c2.transferir(5000, c1);
        }catch (ValorInvalidoException e ){
            System.out.println(e.getMessage(5000)+"\n");
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage(5000)+"\n");
        }
        System.out.println("Saldo atual da c1: "+c1.getSaldo());
        System.out.println("Saldo atual da c2: "+c2.getSaldo());

    }
}