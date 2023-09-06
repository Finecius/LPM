public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo (int diaRendimento){
        saldo+=diaRendimento;
        return saldo;
    }


}
