import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pessoa a = new Pessoa();
        Scanner b = new Scanner(System.in);
        Pessoa albert = new Pessoa(14,3,1879);
        Pessoa newton = new Pessoa(4,1,1643);
        System.out.println("Digite o seu aniversário\ndias:");
        a.setDia(b.nextInt());
        System.out.println("Mês:");
        a.setMes(b.nextInt());
        System.out.println("Ano:");
        a.setAnonasc(b.nextInt());
        b.nextLine();
        System.out.println("Digite seu nome:");
        a.setNome(b.nextLine());
        a.calculaIdade(a.informaIdade(),a.getMes(),a.getAnonasc(),a.getDia());
        newton.calculaIdade(newton.informaIdade(),newton.getMes(),newton.getAnonasc(),newton.getDia());
        albert.calculaIdade(albert.informaIdade(), albert.getMes(),albert.getAnonasc(),albert.getDia());
        System.out.println("Sua idade é: "+a.informaIdade()+"e seu nome é: "+a.informaNome());
        System.out.println("Albert Einstein teria "+albert.informaIdade()+"anos");
        System.out.println("Newton teria "+newton.informaIdade()+"anos");

    }
}