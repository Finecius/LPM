public class Main {
    public static void main(String[] args) {

        CalculoMatematico a = new CalculoMatematico();

        try {
            a.divisao(4,0);
        } catch (ArithmeticException e){
            System.out.println("Não se pode dividir" + e.getMessage());
        }


    }
}