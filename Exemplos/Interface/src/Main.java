public class Main {
    public static void main(String[] args) {

        Aluno al = new Aluno();
        IAluno al2 = new Aluno();
        IAluno al3 = new Bolsista();

        al.chorar();
        al2.chorar();
        al3.chorar();

        System.out.println(al3.calcMedia(2,5));

        Ferrari f8 = new Ferrari();
        f8.abrirPorta();
        System.out.println(f8.getValor());

    }
}