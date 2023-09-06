public class VIP extends Ingresso{
    private double valora;

    public VIP(double valor, double valora) {
        super(valor);
        this.valora = valora;
    }


    public double getValora() {
        return valora;
    }


    public void setValora(double valora) {
        this.valora = valora;
    }


    public void imprimeValor() {
        System.out.println(getValor()+valora);;
    }
}
