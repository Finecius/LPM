import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Pessoa p1= new Pessoa();
        System.out.println("Nome:");
        p1.setNome(a.nextLine());
        System.out.println("CPF:");
        p1.setCpf(a.nextInt());

        Pessoa p2 = new Aluno(454,"ginen",4564);
        p2.mostraTipo();

        Pessoa p3 = new Professor(21903,"Ed",2130);
        p3.mostraTipo();

        Aluno al4 = new Bolsista(666,"Rasec",433,123);
        Pessoa p4=(Pessoa) al4;
        p4.mostraTipo();
    if (p4 instanceof Pessoa)
        System.out.println("É instância");
    else
        System.out.println("Não é instância");
        Aluno al1 = new Aluno();
        a.nextLine();
        System.out.println("Nome:");
        al1.setNome(a.nextLine());
        System.out.println("CPF:");
        al1.setCpf(a.nextInt());
        System.out.println("RA:");
        al1.setRa(a.nextInt());
        al1.calcm(9,4.5);



        Professor prof = new Professor();
        a.nextLine();
        System.out.println("Nome:");
        prof.setNome(a.nextLine());
        System.out.println("CPF:");
        prof.setCpf(a.nextInt());
        System.out.println("Salario:");
        prof.setSalario(a.nextDouble());

        Bolsista b1 = new Bolsista();
        b1.setNome(al1.getNome());
        b1.setCpf(al1.getCpf());
        b1.setRa(al1.getRa());
        System.out.println("Bolsa do aluno: ");
        b1.setBolsa(a.nextDouble());
        double m =b1.calcm(al1.n, al1.n2);
        System.out.println("Bolsista: "+b1.getNome()+" CPF: "+b1.getCpf()+" RA: "+b1.getRa()+" Bolsa: "+b1.getBolsa()+"Media: "+m);
        System.out.println("\nProfessor: "+prof.getNome()+" CPF: "+prof.getCpf()+" Salario: "+prof.getSalario());
        System.out.println("\nPessoa: "+p1.getNome()+" CPF: "+p1.getCpf());

        //atributos privados quando herdados (pai -> filho) nao tem acesso (na classe filha)
    }
}