import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        RegistroAcademico al1 = new RegistroAcademico();
        System.out.println("Digite seu nome: ");
        al1.setNome(a.nextLine());
        System.out.println("Digite o codigo do curso: ");
        al1.setCodigoCurso(a.nextInt());
        System.out.println("ALuno:"+al1.nome+"\nCurso:"+al1.codigoCurso+"\nnumero matricula: "+RegistroAcademico.numeroMatricula);
        RegistroAcademico al2 = new RegistroAcademico("pablo",2022,100);
        System.out.println("\nALuno:"+al2.nome+"\nCurso:"+al2.codigoCurso+"\nnumero matricula: "+RegistroAcademico.numeroMatricula);
}}