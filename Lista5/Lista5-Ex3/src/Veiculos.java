public class Veiculos {
    private String modelo;
    private double preco;


    public Veiculos(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printDados(){
        System.out.println("Modelo: "+modelo+" Preço: "+preco);
    }
}
