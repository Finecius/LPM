public class Circulo extends FormaBidimensional implements AreaCalculavel{
    @Override
    public void calcularArea() {

    }
    private String Numero;

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    protected double r;

    public Circulo(double r) {
        this.r = r;
    }

    @Override
    public double obterArea() {
       return a=3.14*(r*r);
    }
}
