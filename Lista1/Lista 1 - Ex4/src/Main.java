import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Estoque estoque1 = new Estoque();
        Estoque estoque2 = new Estoque();
        Estoque estoque3 = new Estoque();

        System.out.println("Digite o nome do seu produto: ");
        estoque1.setNome(a.nextLine());
        System.out.println("Digite a quantidade atual do seu produto em estoque: ");
        estoque1.setQtdAtual(a.nextInt());
        System.out.println("Digite a quantidade minima do seu produto em estoque: ");
        estoque1.setQtdMinima(a.nextInt());
        a.nextLine();

        System.out.println("Digite o nome do seu produto: ");
        estoque2.setNome(a.nextLine());
        System.out.println("Digite a quantidade atual do seu produto em estoque: ");
        estoque2.setQtdAtual(a.nextInt());
        System.out.println("Digite a quantidade minima do seu produto em estoque: ");
        estoque2.setQtdMinima(a.nextInt());
a.nextLine();

        System.out.println("Digite o nome do seu produto: ");
        estoque3.setNome(a.nextLine());
        System.out.println("Digite a quantidade atual do seu produto em estoque: ");
        estoque3.setQtdAtual(a.nextInt());
        System.out.println("Digite a quantidade minima do seu produto em estoque: ");
        estoque3.setQtdMinima(a.nextInt());


        estoque1.darBaixa(estoque1.getQtdAtual()-5);
        estoque2.repor(estoque2.getQtdAtual()+7);
        estoque3.darBaixa(estoque3.getQtdAtual()-4);
        System.out.println("\nO estoque 1 precisa ou não de um reestoque?: "+estoque1.precisaRepor()+"Mostrando: "+estoque1.getQtdAtual());
        System.out.println("\nO estoque 2 precisa ou não de um reestoque?: "+estoque2.precisaRepor());
        System.out.println("\nO estoque 3 precisa ou não de um reestoque?: "+estoque3.precisaRepor());


    }
}