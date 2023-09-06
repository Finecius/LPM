public class Bolsista extends Aluno{
    private double bolsa;

    public Bolsista(int cpf, String nome, int ra, double bolsa) {
        super(cpf, nome, ra);
        this.bolsa = bolsa;
    }
    public Bolsista(){
        bolsa=0;
    }

    @Override
    public void mostraTipo() {
        super.mostraTipo();
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }


    @Override
    double calcm(double n, double n2) {
        return super.calcm(n, n2)+1;
    }
}

