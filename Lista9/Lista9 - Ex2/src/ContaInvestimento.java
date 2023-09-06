public class ContaInvestimento extends ContaBancaria{


    @Override
    public void calcularSaldo() {
        saldo*=1.05;
    }
}
