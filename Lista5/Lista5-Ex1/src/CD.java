public class CD extends Produto{
    private int faixas;

    public CD(int codigo, String nome, double preco, int faixas) {
        super(codigo, nome, preco);
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return super.toString()+" Número de Faixas: "+faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
}
