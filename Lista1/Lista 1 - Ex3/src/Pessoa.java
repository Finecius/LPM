public class Pessoa {
    int idade, dia, mes, anonasc;
    String nome;

public Pessoa (int dia, int mes, int anonasc, String nome){
    this.anonasc = anonasc;
    this.dia = dia;
    this.mes = mes;
    this.nome = nome;
}
public Pessoa(){
    anonasc = 0;
    dia = 0;
    mes = 0;
    idade = 0;
    nome = "";
}
public Pessoa(int dia,int mes,int anonasc){
    this.dia = dia;
    this.mes = mes;
    this.anonasc = anonasc;

}

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

        if (dia>=1 && dia<=31)
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
       if(mes>=1 && mes<=12)
        this.mes = mes;
    }

    public int getAnonasc() {
        return anonasc;
    }

    public void setAnonasc(int anonasc) {
        if (anonasc>1000)
        this.anonasc = anonasc;
    }

    public String informaNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void calculaIdade(int idade,int mes,int anonasc,int dia){
    if(mes<=3)
    this.idade = 2023-anonasc;
    else
        this.idade = 2022-anonasc;

    }
    public int informaIdade(){
    return idade;
    }
}
