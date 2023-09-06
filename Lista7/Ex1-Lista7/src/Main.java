import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Building b1 = new House(40,false,190,false);
        Building b2 = new School(120,true,12300,true);

        Car c1 = new Car("Gasolina",8);
        Car c2 = new Car("Eletrico",6);

        Bicycle b = new Bicycle("Puma",40);
        Bicycle b0 = new Bicycle("Umbro",20);

        ArrayList<Object> lista = new ArrayList<Object>();
        lista.add(b2);
        lista.add(b1);
        lista.add(c1);
        lista.add(c2);
        lista.add(b);
        lista.add(b0);
        for (Object i:lista){
            if(i instanceof Building){
                Building i0 = (Building) i;
                System.out.println(" Building: "+i0.getCarbonFootprint());
            }
            if(i instanceof Car){
                Car i0 = (Car) i;
                System.out.println(" Car: "+i0.getCarbonFootprint());
            }
            if(i instanceof Bicycle){
                Bicycle i0 = (Bicycle) i;
                System.out.println(" Bicycle: "+i0.getCarbonFootprint());
            }

        }

    }
}