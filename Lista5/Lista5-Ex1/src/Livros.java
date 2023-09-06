public class Livros extends Produto{
    private String autor;

    public Livros(int codigo, String nome, double preco, String autor) {
        super(codigo, nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString()+" Autor: "+autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
