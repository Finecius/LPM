public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        try {
            a.setRa(-31);
        }   catch (NegativeARException e){
            System.out.println(e.getMessage());
        }
        try {
            a.setNome("");

        }catch (NullNameException e){
            System.out.println(e.getMessage());
        }
        try {
            a.setAltura(-1);
        }catch (NegativeHeightException e){
            System.out.println(e.getMessage());
        }
    }
}