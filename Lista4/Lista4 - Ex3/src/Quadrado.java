public class Quadrado extends FormaBidimensional{
    protected double l;

    public Quadrado(double l) {
        this.l = l;
    }

    @Override
    public double obterArea() {
       return super.obterArea()*(l*l);
    }
}
