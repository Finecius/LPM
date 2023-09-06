public class DVD extends Produto{
    private int duracao;

    public DVD(int codigo, String nome, double preco, int duracao) {
        super(codigo, nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString()+" Duração: "+duracao+"min";
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
