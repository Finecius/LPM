public class Artista {
    private String nome;
    private int codigo;
    private String N;

    public Artista(String nome, int codigo, String n) {
        this.nome = nome;
        this.codigo = codigo;
        N = n;
    }

    public String getNome() {
        return nome;
    }

    public String getN() {
        return N;
    }

    public void mostraDados(){
        System.out.println("Nome: "+nome+" Código: "+codigo+" Nacionalidade: "+N);
    }
}
