public class Truco extends JogoDeCartas{

    @Override
    public int qtdCartasDistribuidas() {
        return 18;
    }

    @Override
    public int numeroParticipantes() {
        return 6;
    }

    @Override
    public void iniciar() {
        System.out.println("Após as cartas serem destribuidas começa o jogo..");
    }

    @Override
    public void finalizar() {
        System.out.println("Bem jogado!, o Truco se finaliza");
    }

    @Override
    public void jogar() {
        System.out.println("Sua vez de jogar, boa sorte..");
    }
}
