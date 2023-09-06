public class Imovel {

    private double preco;
    private String endereco;


    public Imovel(double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
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

    public void imprimeDados(){
        System.out.println("A localização do imovel: "+endereco+ ", E o seu preço: "+preco);
    }
}
