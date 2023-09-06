public class Cliente extends Pessoa implements IPessoa{

    protected String nome, email;
    protected int idade, cpf, CNH;

    @Override
    public void exibir() {
        System.out.println("Nome: "+nome+ ", Email: "+email+", Idade: "+idade+", CPF: "+cpf+", Numero da CNH: "+CNH);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty())
        {
            throw new NullValueException();
        }
        else
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isEmpty())
        {
            throw new NullValueException();
        }
        else
            this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0){
            throw new NegativeNumberException();
        }
        else
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        if(cpf<0){
            throw new NegativeNumberException();
        }
        else
        this.cpf = cpf;
    }

    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
       if(CNH<0){
           throw new NegativeNumberException();
       }
        else
        this.CNH = CNH;
    }
}
