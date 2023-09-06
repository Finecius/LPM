public class Buraco extends JogoDeCartas{

    @Override
    public int qtdCartasDistribuidas() {
        return 44;
    }

    @Override
    public int numeroParticipantes() {
        return 4;
    }

    @Override
    public void iniciar() {
        System.out.println("Cartas entregues! que o jogo comece..");
    }

    @Override
    public void finalizar() {
        System.out.println("O jogo termina, Bem jogado!");
    }

    @Override
    public void jogar() {
        System.out.println("Sua vez de jogar, boa sorte!");
    }
}
