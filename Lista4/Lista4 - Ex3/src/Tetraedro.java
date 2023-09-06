public class Tetraedro extends FormaTridimensional{
  protected double l;
    public Tetraedro( double l) {
        this.l = l;
    }
    @Override
    public double obterArea() {
        return At=(l*l)*Math.sqrt(3);
    }

    @Override
    public double obterVolume() {
        return v=((l*l*l)*Math.sqrt(2))/12;
    }
}
