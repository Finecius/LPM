import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artista> l = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String busca;
        Artista a = new Artista("Roberto Carlos",23,"Brasil");
        Artista b = new Artista("Led Zeppelin",34,"Inglaterra");
        Artista c = new Artista("Matue",54,"Brasil");
        Artista d = new Artista("Drake",77,"Inglaterra");
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        System.out.println("MENU\n ------------------------------");
        do {
            System.out.println("------------------------\nDigite o nome do cantor ou nacionalidade\n(0) para encerrar ");
            busca=s.nextLine();
            busca=busca.toUpperCase();
        for (Artista i :l) {
        if (busca.equals(i.getN().toUpperCase()) || busca.equals(i.getNome().toUpperCase())) {
            i.mostraDados();
        }
        }

        }while(!busca.equals("0"));

        ArrayList<Musica> l2 = new ArrayList<>();

        Musica a2 = new Musica(23,"Kamikaze",30,"Kamikazes","Drake");
        Musica b2= new Musica(54,"House",2,"Kamikazes","Eminem");
        Musica c2 = new Musica(232,"Rap God",4,"Slim shady LP","Rap lord");

        l2.add(a2);
        l2.add(b2);
        l2.add(c2);

        System.out.println("MENU\n ------------------------------");
        do {
            System.out.println("------------------------\nDigite o nome do album \n(0) para encerrar ");
            busca=s.nextLine();
            busca=busca.toUpperCase();
            for (Musica i :l2) {
                if (busca.equals(i.getAlbum().toUpperCase())) {
                    i.mostrarDados();
                }
            }

        }while(!busca.equals("0"));

    }
    }
