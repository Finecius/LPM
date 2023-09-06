public class Aluno {
    private int ra;
    private String nome;
    private double altura;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0){
            throw new NegativeARException();
        }
        else
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty()){
            throw new NullNameException();
        }
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<0){
            throw new NegativeHeightException();
        }
        else {
            this.altura=altura;
        }
        this.altura = altura;
    }
}
