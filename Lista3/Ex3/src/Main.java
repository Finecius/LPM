public class Main {
    public static void main(String[] args) {
        NOVO i1 = new NOVO(40,40000,"rua",9000);
        USADO i2 = new USADO(39,49000,"rua 3",200);
        i1.imprimeDados(i1.getCodigo(),i1.getPreco(),i1.getEndereco(),i1.getPrecoAdicional());
        i2.imprimeDados(i2.getCodigo(), i2.getPreco(), i2.getEndereco(), i2.getDesconto());
        double soma=i1.soma(i1.getPrecoAdicional());
        double desconto=i2.somaDesconto(i2.getDesconto());
        System.out.println("Novo valor com preço adicional: "+soma);
        System.out.println("Novo valor com desconto: "+desconto);
    }
}