public class Novo extends Imovel{
    private double adicional=1000;

    public Novo(double preco, String endereco, double adicional) {
        super(preco, endereco);
        this.adicional = adicional;
    }

    @Override
    public void imprimeDados() {
        System.out.println("O endereço é: "+getEndereco()+", O valor é:"+(getPreco()+adicional));
    }
}
