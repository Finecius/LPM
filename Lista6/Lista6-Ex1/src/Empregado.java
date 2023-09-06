public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String CPF;

    public Empregado(String nome, String sobrenome, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
    }

    public void mostraDados(){
        System.out.println("Nome :"+nome+" "+sobrenome+" CPF: "+CPF);
    }

    public abstract double vencimento();

}
