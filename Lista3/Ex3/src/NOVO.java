public class NOVO extends IMOVEL {
    private double precoAdicional;

    public NOVO(int codigo, double preco, String endereco, double precoAdicional) {
        super(codigo, preco, endereco);
        this.precoAdicional = precoAdicional;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
    public double soma(double precoAdicional){
        double preco;
        return  preco=getPreco()+precoAdicional;
    }

    public void imprimeDados(int codigo, double preco, String endereco, double precoAdicional) {
        super.imprimeDados(codigo, preco, endereco);
        System.out.println("Preço adicional= "+this.precoAdicional);
    }
}
