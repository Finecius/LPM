public class Cubo extends FormaTridimensional{
protected double l;


    public Cubo(double l) {
        this.l = l;
    }

    @Override
    public double obterArea() {
        return At=6*(l*l);
    }

    @Override
    public double obterVolume() {
        return v=(l*l*l);
    }
}
