public class Poupanca {
    static double taxaJurosAnual;
    private double saldo;

    public void calcularJurosMensais(double saldo){
        this.saldo = saldo*(taxaJurosAnual/12);
    }

    public Poupanca(double saldo) {
        this.saldo = saldo;
    }


    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void modificaTaxaJuros(double taxaJurosAnual) {
        Poupanca.taxaJurosAnual = taxaJurosAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
