public class Preguiça extends Animal{
    public Preguiça(String nome, int idade) {
        super(nome, idade);
    }

    public Preguiça() {
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
        System.out.println("uuuuu");
    }
    public void subir(){
        System.out.println("Preguiça está subindo");
    }

}
