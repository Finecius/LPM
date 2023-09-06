public class Secretaria extends Funcionario {
    private int numero;

    public Secretaria(String nome, double salario, int numero) {
        super(nome, salario);
        this.numero = numero;
    }

    @Override
    public void mostraDados() {
        System.out.println("Número: "+this.numero);
        super.mostraDados();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
