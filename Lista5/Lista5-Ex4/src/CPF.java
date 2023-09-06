public class CPF extends Cliente{
    private int CPF;

    public CPF(String nome, String endereco, int telefone, int CPF) {
        super(nome, endereco, telefone);
        this.CPF = CPF;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println(" CPF: "+CPF);
    }
}
