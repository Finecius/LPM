public class Cheque implements TipoPagamento{
    public double valor;

    public Cheque(double valor) {
        this.valor = valor;
    }

    @Override
    public int getDiasFaturamento() {
        return 3;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return 0.3;
    }
}
