public class Main {
    public static void main(String[] args) {

        TipoPagamento p1 = new Dinheiro(150);
        TipoPagamento p2 = new Cheque(500);
        TipoPagamento p3 = new CartaoCredito(1000);

        System.out.println(p1.getDiasFaturamento());
        System.out.println(p2.getDiasFaturamento());
        System.out.println(p3.getDiasFaturamento());

        System.out.println(p1.getPorcentagemFinanceiraPaga());
        System.out.println(p2.getPorcentagemFinanceiraPaga());
        System.out.println(p3.getPorcentagemFinanceiraPaga());




    }
}