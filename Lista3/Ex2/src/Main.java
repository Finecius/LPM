import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Jedson",876,5000);
        ContaPoupanca conta2 = new ContaPoupanca("Cleber",675,1500,500);
        ContaEspecial conta3 = new ContaEspecial("Robertson",324,2900,500);

        System.out.println("Nome do cliente: "+conta1.getCliente()+", Numero da conta: "+conta1.getNumConta()+", saldo: "+conta1.saldo);
        System.out.println("Nome do cliente: "+conta2.getCliente()+", Numero da conta: "+conta2.getNumConta()+", saldo: "+conta2.saldo+" Novo saldo: "+conta2.calcularNovoSaldo(conta2.getDiaRendimento()));
        System.out.println("Nome do cliente: "+conta3.getCliente()+", Numero da conta: "+conta3.getNumConta()+", saldo: "+conta3.saldo);

        conta1.depositar(500);
        conta2.depositar(600);
        conta3.depositar(150);

        System.out.println("Nome do cliente: "+conta1.getCliente()+", Numero da conta: "+conta1.getNumConta()+", saldo: "+conta1.saldo);
        System.out.println("Nome do cliente: "+conta2.getCliente()+", Numero da conta: "+conta2.getNumConta()+", saldo: "+conta2.saldo+" Novo saldo: "+conta2.calcularNovoSaldo(conta2.getDiaRendimento()));
        System.out.println("Nome do cliente: "+conta3.getCliente()+", Numero da conta: "+conta3.getNumConta()+", saldo: "+conta3.saldo);

        conta1.sacar(50);
        conta2.sacar(2700);
        conta3.sacar(600);

        System.out.println("Nome do cliente: "+conta1.getCliente()+", Numero da conta: "+conta1.getNumConta()+", saldo: "+conta1.saldo);
        System.out.println("Nome do cliente: "+conta2.getCliente()+", Numero da conta: "+conta2.getNumConta()+", saldo: "+conta2.saldo+" Novo saldo: "+conta2.calcularNovoSaldo(conta2.getDiaRendimento()));
        System.out.println("Nome do cliente: "+conta3.getCliente()+", Numero da conta: "+conta3.getNumConta()+", saldo: "+conta3.saldo);


    }
}