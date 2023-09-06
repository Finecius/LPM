public class Funcionario {
    private String nome,sobrenome;
    private double SlMns;

public Funcionario (String nome, String sobrenome, Double SlMns){

this.nome = nome;
this.sobrenome = sobrenome;
this.SlMns= SlMns;
}
public Funcionario (){
    nome = "";
    sobrenome = "";
    SlMns = 0;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSlMns() {
        return SlMns;
    }

    public void setSlMns(double SlMns) {

        if (SlMns < 0)
            this.SlMns = 0;
        else
            this.SlMns = SlMns;
    }
    public double salAnual(){
    return (SlMns*12);
}
    public void aumento(double SlMns){
    this.SlMns += SlMns * 0.1;
    }
}
