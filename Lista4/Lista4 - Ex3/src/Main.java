import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       ArrayList<Forma> a = new ArrayList<Forma>();
       Quadrado q = new Quadrado(4);
       Triangulo t = new Triangulo(3,4);
       Circulo c = new Circulo(4);
       Cubo C = new Cubo(5);
       Tetraedro T = new Tetraedro(4);
       Esfera e = new Esfera(8);
       a.add(q);
       a.add(t);
        a.add(c);
        a.add(C);
        a.add(T);
        a.add(e);

        for(Forma i:a){
            if(i instanceof FormaBidimensional) {
                FormaBidimensional F = (FormaBidimensional) i;
                System.out.println("Área:" + F.obterArea());
            }
            if (i instanceof FormaTridimensional){
                FormaTridimensional f = (FormaTridimensional) i;
                System.out.println("Volume:"+f.obterVolume()+" Area:"+f.obterArea());
            }
            }
        }
    }
