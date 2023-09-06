public class Antigo extends Imovel{
    private double desconto=1000;

    public Antigo(double preco, String endereco, double desconto) {
        super(preco, endereco);
        this.desconto = desconto;
    }

    @Override
    public void imprimeDados() {
        System.out.println("O endereço é: "+getEndereco()+", O valor é:"+(getPreco()-desconto));
    }
}
