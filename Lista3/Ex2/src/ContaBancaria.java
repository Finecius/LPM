public class ContaBancaria {

   private String cliente;
   private int numConta;
   protected double saldo;


    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double sacar(double valorSaque) {
        if((saldo-valorSaque)<0){
            System.out.println("Não foi possivel sacar.");
        return 0;}
        else return saldo-valorSaque;
       }

       public double depositar(int valorDeposito){
           return saldo+valorDeposito;
       }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
