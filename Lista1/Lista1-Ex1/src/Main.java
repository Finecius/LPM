import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        Funcionario b = new Funcionario();
        System.out.println("Digite seu nome: ");
        b.setNome(a.nextLine());
        System.out.println("Digite seu sobrenome: ");
        b.setSobrenome(a.nextLine());
        System.out.println("Digite o seu salário mensal: ");
        b.setSlMns(a.nextDouble());

        Funcionario c = new Funcionario();
        a.nextLine();
        System.out.println("Digite seu nome: ");
        c.setNome(a.nextLine());
        System.out.println("Digite seu sobrenome: ");
        c.setSobrenome(a.nextLine());
        System.out.println("Digite o seu salário mensal: ");
        c.setSlMns(a.nextDouble());

        System.out.println("O salário anual do funcionario "+b.getNome()+b.getSobrenome()+" é igual a: "+b.salAnual());
        System.out.println("O salário anual do funcionario "+c.getNome()+c.getSobrenome()+" é igual a: "+c.salAnual());
 b.aumento(b.getSlMns());
 c.aumento(c.getSlMns());
        System.out.println("O salário com aumento (anual) do funcionario "+b.getNome()+" "+b.getSobrenome()+" é igual a: "+b.salAnual());
        System.out.println("O salário com aumento (anual) do funcionario: "+c.getNome()+" "+c.getSobrenome()+" é igual a: "+c.salAnual());


    }
}