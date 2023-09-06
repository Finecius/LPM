public class Esfera extends FormaTridimensional{
  protected double r;

    public Esfera(double r) {
        this.r = r;
    }

    @Override
    public double obterArea() {
       return At=4*3.14*(r*r);
    }

    @Override
    public double obterVolume() {
        return v=(4/3)*3.14*(r*r*r);
    }
}
