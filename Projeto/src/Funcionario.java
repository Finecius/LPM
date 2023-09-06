public class Funcionario extends Pessoa implements IPessoa{

    protected String nome;
    protected int idade, cpf, codigo , cll;

    @Override
    public void exibir() {
        System.out.println("Nome: "+nome+ ", Codigo: "+codigo+", Idade: "+idade+", CPF: "+cpf+", Numero do celular: "+cll);
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
      if(nome.isEmpty()){
          throw new NullValueException();
      }else
        this.nome = nome;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0){
            throw new NegativeNumberException();
        }else
            this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if(cpf<0){
            throw new NegativeNumberException();
        }else
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo<0){
            throw new NegativeNumberException();
        }else
        this.codigo = codigo;
    }

    public int getCll() {
        return cll;
    }

    public void setCll(int cll) {
        if(cll<0){
            throw new NegativeNumberException();
        }else
        this.cll = cll;
    }
}
