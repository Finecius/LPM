public class Dinheiro implements TipoPagamento{
    public double valor;

    public Dinheiro(double valor) {
        this.valor = valor;

    }

    @Override
    public int getDiasFaturamento() {
        return 0;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return 0;
    }
}
