public class Moto extends Veiculos{
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println(" Ano: "+ano);
    }

    public int getAno() {
        return ano;
    }
}
