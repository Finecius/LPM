public class Estoque {
    private String nome;
    private double qtdAtual , qtdMinima;

    Estoque (){
this.qtdMinima=qtdMinima;
this.nome=nome;
this.qtdAtual=qtdAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public double getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public double repor(double v){
        return getQtdAtual();
    }

    public double darBaixa(double v){
        return getQtdAtual();
    }

    public void mostra(){
    System.out.println(nome+qtdAtual+qtdMinima);
    }

    public boolean precisaRepor(){
        if(qtdAtual<=qtdMinima)
            return true;
        else
            return false;
    }

    public int getQtdAtual(int qtdAtual) {
        return qtdAtual;
    }
}
