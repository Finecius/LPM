
public class Main {
    public static void main(String[] args) {
        Poupanca poupanca1 = new Poupanca(2000);
        Poupanca poupanca2 = new Poupanca(3000);
        Poupanca.modificaTaxaJuros(3);
        poupanca1.calcularJurosMensais(poupanca1.getSaldo());
        poupanca2.calcularJurosMensais(poupanca2.getSaldo());
        System.out.println("A poupança 1 ficou com saldo de R$"+poupanca1.getSaldo()+"A poupança 2 ficou com saldo de R$"+poupanca2.getSaldo());
        Poupanca.modificaTaxaJuros(4);
        poupanca1.calcularJurosMensais(poupanca1.getSaldo());
        poupanca2.calcularJurosMensais(poupanca2.getSaldo());
        System.out.println("A poupança 1 ficou com saldo de R$"+poupanca1.getSaldo()+"A poupança 2 ficou com saldo de R$"+poupanca2.getSaldo());

    }
}