public class Main {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        a.falar();
        Gato b = new Gato();
        Animal c = (Animal) b;
        c.falar();

    }
}