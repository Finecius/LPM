public class ContaJunior extends ContaCorrente {
    private int idade;

    public ContaJunior(double saldo, String nome, int idade) {
        super(saldo, nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
