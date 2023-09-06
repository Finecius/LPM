public class ContaCorrida extends ContaCorrente {
    private double extra;
    public ContaCorrida(double saldo, String nome , double extra) {
        super(saldo, nome);
        this.extra=extra;
    }

    @Override
    public void deposita(double saldo) {
        super.deposita(saldo);
        System.out.println(saldo);
    }

    public void add(){
        System.out.println("Adicionando");

    }
}
