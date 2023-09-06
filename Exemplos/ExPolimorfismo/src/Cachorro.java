public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public Cachorro() {
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
        System.out.println("Au");
    }
    public void correr(){
        System.out.println("Cachorro está correndo");
    }
}
