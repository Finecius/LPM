public class ContaCorrente {
    private double saldo=0;
    private  String nome;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  void deposita(double saldo) {
        this.saldo += saldo;
        System.out.println(saldo);
        System.out.println(nome);
    }

    public ContaCorrente(double saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
