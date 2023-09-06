public class Pessoa {
    private int cpf;
    private String nome;

    public Pessoa(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public Pessoa(){
        cpf=0;
        nome="";
    }
    public void mostraTipo(){
        System.out.println("É uma pessoa");
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
