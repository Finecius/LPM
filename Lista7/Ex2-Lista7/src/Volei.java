public class Volei extends JogoComBola{
    protected String equipe1, equipe2;

    @Override
    public void setNomesEquipes(String equipe1, String equipe2) {
    this.equipe1= equipe1;
    this.equipe2 = equipe2;

    }

    @Override
    public void iniciar() {
        System.out.println("O saque é efetuado, começa o jogo.. "+equipe1+" X "+equipe2);
    }

    @Override
    public void finalizar() {
        System.out.println("O arbitro apita, fim de jogo..");
    }

    @Override
    public void jogar() {
        System.out.println("Você entrou em quadra, Boa sorte!");
    }
}
