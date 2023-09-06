public class Main {
    public static void main(String[] args) {
        Animal C1 = new Cachorro();
        Animal C2 = new Cavalo();
        Preguiça C4 = new Preguiça();
        Animal C3 = (Animal) C4;
        System.out.println("O cachorro faz: ");
        C1.emitirSom();
        System.out.println("O cavalo faz: ");
        C2.emitirSom();
        System.out.println("A preguiça faz: ");
        C3.emitirSom();

        if(C1 instanceof Animal)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");

        if(C2 instanceof Animal)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");

        if(C3 instanceof Animal)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");

        System.out.println("\n");

        if(C1 instanceof Cachorro)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");
        if(C2 instanceof Cachorro)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");
        if(C3 instanceof Cachorro)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");

        System.out.println("\n");

        if(C1 instanceof Cavalo)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");
        if(C2 instanceof Cavalo)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");
        if(C3 instanceof Cavalo)
            System.out.println("É instância");
        else
            System.out.println("Não é instância");

    }

}