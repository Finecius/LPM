public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public Cavalo() {
        super();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Irrraaa");
    }
    public void correr(){
        System.out.println("Cavalo está correndo");
    }
}
