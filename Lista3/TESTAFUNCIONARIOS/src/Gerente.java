public class Gerente extends Funcionario{
    private String usuario;
    private String senha;

    public Gerente(String nome, double salario, String usuario, String senha) {
        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public double CalculaBonificacao(double salario) {
        return super.CalculaBonificacao(salario)+500;
    }

    @Override
    public void mostraDados() {
        System.out.println("Usuário: "+this.usuario+" Senha: "+this.senha);
        super.mostraDados();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
