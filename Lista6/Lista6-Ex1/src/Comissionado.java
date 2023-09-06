public class Comissionado extends Empregado{
    private double totalVenda;
    private double taxaComissao;

    public Comissionado(String nome, String sobrenome, String CPF, double totalVenda, double taxaComissao) {
        super(nome, sobrenome, CPF);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }


    @Override
    public double vencimento() {
        return taxaComissao*totalVenda;
    }
}
