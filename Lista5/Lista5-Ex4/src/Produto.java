public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private double unidade;

    public Produto(int codigo, String descricao, double preco, double unidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.unidade = unidade;
    }

    public void mostrarDados(){
        System.out.println("Código: "+codigo+" descrição: "+descricao+" Preço: R$"+preco+" unidade de medida: "+unidade);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
