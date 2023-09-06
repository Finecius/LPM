public class Produto {
    private String descricao;
    private double preco;
    private String fabricante;
    private String nome;
    private int codigo;


    public void exibir(){
        System.out.println("Nome: "+nome+", Descrição: "+descricao+", Fabricante: "+fabricante+", Código: "+codigo+", Preço: "+preco);
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.isEmpty()){
            throw new NullValueException();
        }
        else
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco<0){
            throw new NegativeNumberException();
        } else

        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if(fabricante.isEmpty()){
            throw new NullValueException();
        }
        else
            this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty()){
            throw new NullValueException();
        }
        else
            this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo<0){
            throw new NegativeNumberException();
        } else if (codigo == 0) {
            throw new NullValueException();
        } else
        this.codigo = codigo;
    }
}
