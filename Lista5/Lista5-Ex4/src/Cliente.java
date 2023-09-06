public class Cliente {
    private String nome;
    private String endereco;
    private int telefone;

    public Cliente(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+nome+" Endereço: "+endereco+" Telefone: "+telefone);
    }

    public String getNome() {
        return nome;
    }
}
