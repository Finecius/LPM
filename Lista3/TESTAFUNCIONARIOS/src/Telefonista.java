public class Telefonista extends Funcionario{
    private int codigo;

    public Telefonista(String nome, double salario, int codigo) {
        super(nome, salario);
        this.codigo = codigo;
    }

    @Override
    public void mostraDados() {
        System.out.println("Código: "+this.codigo);
        super.mostraDados();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
