import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        JogoComBola jg1 = new Futebol();
        JogoComBola jg2 = new Volei();
        JogoComBola jg3 = new Volei();
        JogoDeCartas jg4 = new Buraco();
        JogoDeCartas jg5 = new Truco();
        JogoDeCartas jg6 = new Truco();
        JogoDeCartas jg7 = new Truco();

        ArrayList <NomeJogo> L = new ArrayList<>();

        L.add(jg1);
        L.add(jg2);
        L.add(jg3);
        L.add(jg4);
        L.add(jg5);
        L.add(jg6);
        L.add(jg7);

        for ( NomeJogo r : L){
            if (r instanceof JogoDeCartas){
                if(r instanceof Truco){
                    Truco l1 = (Truco) r;
                    l1.iniciar();
                    l1.jogar();
                    System.out.println("Quantidade de participantes: "+l1.numeroParticipantes());
                    System.out.println("Quantidade de cartas distribuidas: "+l1.qtdCartasDistribuidas());
                    l1.finalizar();
                    System.out.println("--------------------------------------\n\n");
                }
                if(r instanceof Buraco){
                    Buraco l2 = (Buraco) r;
                    l2.iniciar();
                    l2.jogar();
                    System.out.println("Quantidade de participantes: "+l2.numeroParticipantes());
                    System.out.println("Quantidade de cartas distribuidas: "+l2.qtdCartasDistribuidas());
                    l2.finalizar();
                    System.out.println("--------------------------------------\n\n");
                }
            }
            if(r instanceof JogoComBola){
                if (r instanceof Futebol){
                    Futebol l3 = (Futebol) r;
                    l3.setNomesEquipes("Flamengo","Vasco");
                    l3.iniciar();
                    l3.jogar();
                    l3.finalizar();
                    System.out.println("--------------------------------------\n\n");
                }
                if(r instanceof Volei){
                    Volei l4 = (Volei) r;
                    l4.setNomesEquipes("Minas","Praia Clube");
                    l4.iniciar();
                    l4.jogar();
                    l4.finalizar();
                    System.out.println("--------------------------------------\n\n");
                }
            }
        }







    }
}