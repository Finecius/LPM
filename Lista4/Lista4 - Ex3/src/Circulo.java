public class Circulo extends FormaBidimensional{
    protected double r;

    public Circulo(double r) {
        this.r = r;
    }

    @Override
    public double obterArea() {
       return a=3.14*(r*r);
    }
}
