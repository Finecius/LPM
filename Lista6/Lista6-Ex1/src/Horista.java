public class Horista extends Empregado{
    private double precoHora;
    private double horasTrabalhadas;

    public Horista(String nome, String sobrenome, String CPF, double precoHora, double horasTrabalhadas) {
        super(nome, sobrenome, CPF);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento() {
        return precoHora*horasTrabalhadas;
    }
}
