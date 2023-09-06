public class ContaEspecial extends ContaBancaria{

    private float limite;

    public ContaEspecial(String cliente, int numConta, double saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public double sacar(double valorSaque) {
        if(super.sacar(valorSaque)-saldo>limite){
            System.out.println("Este saque está acima do seu limite");
            return 0;}
        else return super.sacar(valorSaque);
    }
}
