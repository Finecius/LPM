public class Aluno extends Pessoa{
    private int ra;
    protected double n,n2;
    public Aluno(int cpf, String nome, int ra) {
        super(cpf, nome);
        this.ra = ra;
    }
    public Aluno(){
        ra=0;
    }

    @Override
    public void mostraTipo() {
        super.mostraTipo();
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    double calcm(double n,double n2){
        double m;
        return m=(n+n2)/2;
    }
}
