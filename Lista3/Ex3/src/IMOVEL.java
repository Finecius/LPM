public abstract class IMOVEL {
    private int codigo;
    private double preco;
    private String endereco;

    public IMOVEL(int codigo, double preco, String endereco) {
        this.codigo = codigo;
        this.preco = preco;
        this.endereco = endereco;
    }
    public IMOVEL(){
        codigo=0;
        preco=0;
        endereco="";
    }
    public void imprimeDados(int codigo,double preco, String endereco){
        System.out.println("\nCódigo= "+this.codigo+"\nPreço= "+this.preco+"\nEndereço= "+this.endereco);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
