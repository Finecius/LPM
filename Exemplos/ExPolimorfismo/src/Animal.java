public class Animal {
    private String Nome;
    private int Idade;

    public Animal(String nome, int idade) {
        Nome = nome;
        Idade = idade;
    }

    public Animal(){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public void emitirSom(){
    }
}
