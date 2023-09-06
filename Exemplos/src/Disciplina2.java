public class Disciplina2 {

private String nome;
private String sigla;
private String professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void mostrarNome (){
    System.out.println("Nome: "+nome);
}
public void mostrarSigla (){
    System.out.println("Sigla: "+sigla);
}
public void mostrarProfessor (){
    System.out.println("professor: "+professor);
}
}
