public class USADO extends IMOVEL{
    private double desconto;

    public USADO(int codigo, double preco, String endereco, double desconto) {
        super(codigo, preco, endereco);
        this.desconto = desconto;
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

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double somaDesconto(double desconto){
        double preco;
        return preco=getPreco()-desconto;
    }

    public void imprimeDados(int codigo, double preco, String endereco, double desconto) {
        super.imprimeDados(codigo, preco, endereco);
        System.out.println("Desconto= "+this.desconto);
    }
}
