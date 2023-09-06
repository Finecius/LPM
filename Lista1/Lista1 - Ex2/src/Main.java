import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        Item b = new Item();
        System.out.println("Digite o CODIGO do item: ");
        b.setCode(a.nextInt());
        a.nextLine();
        System.out.println("Digite a descrição do produto: ");
        b.setDesc(a.nextLine());
        System.out.println("Digite o preço do item requisitado: ");
        b.setPrecoItem(a.nextDouble());
        System.out.println("Digite a quantidade que foi comprada: ");
        b.setQuantComprada(a.nextInt());

        System.out.println("O código do produto: " +b.getCode()+"\nQue possui a seguinte descrição: "+b.getDesc()+"\nDe preço: "+ b.getPrecoItem()+"\nE na quantidade: "+b.getQuantComprada()+ "\nOu seja, o TOTAL da compra é de: "+ b.getTotal());
    }
}