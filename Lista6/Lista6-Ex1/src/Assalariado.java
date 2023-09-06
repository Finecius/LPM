public class Assalariado extends Empregado{
    private double salario;

    public Assalariado(String nome, String sobrenome, String CPF, double salario) {
        super(nome, sobrenome, CPF);
        this.salario = salario;
    }


    @Override
    public double vencimento() {
        return salario;
    }
}
