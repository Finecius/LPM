public class Construtore {
    private String cor;
    private String modelo;
    private float ponta;
    private boolean tampada;



    //construtor
    public Construtore(String cor, String modelo, float ponta, boolean tampada) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
