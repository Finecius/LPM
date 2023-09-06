public class RegistroAcademico {
    String nome;
    static int numeroMatricula=0;
    int codigoCurso;
    int percentualCobranca;

    public RegistroAcademico(String nome, int codigoCurso, int percentualCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        numeroMatricula++;
    }
    public RegistroAcademico(){
        nome="";
        codigoCurso=0;
        percentualCobranca=100;
        numeroMatricula++;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroMatricula() {
        return numeroMatricula;
    }


    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getPercentualCobranca() {
        return percentualCobranca;
    }

    public void setPercentualCobranca(int percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }
}
