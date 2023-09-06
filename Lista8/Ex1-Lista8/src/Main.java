public class Main {
    public static void main(String[] args) {

        Object o = null;


        try {
            o.toString();
        } catch (NullPointerException e){
            System.out.println("O seu object não pode ser: "+e.getMessage());
        }

    }
}