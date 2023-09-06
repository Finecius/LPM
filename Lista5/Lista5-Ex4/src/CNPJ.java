public class CNPJ extends Cliente{
    private int CNPJ;
    private String nomeF;

    public CNPJ(String nome, String endereco, int telefone, int CNPJ, String nomeF) {
        super(nome, endereco, telefone);
        this.CNPJ = CNPJ;
        this.nomeF = nomeF;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println(" CNPJ: "+CNPJ+" Nome Fantasia: "+nomeF);
    }
}
