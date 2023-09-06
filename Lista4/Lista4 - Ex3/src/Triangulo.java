public class Triangulo extends FormaBidimensional{
    protected double b;
    protected double h;

    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double obterArea() {
        return super.obterArea()*((b*h)/2);
    }
}
