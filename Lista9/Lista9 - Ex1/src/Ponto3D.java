public class Ponto3D extends Ponto2D{

    private double cordz;

    public Ponto3D(double cordx, double cordy, double cordz) {
        super(cordx, cordy);
        this.cordz = cordz;
    }

    @Override
    public String toString() {
        return super.toString() + (" e Cordenada z: "+cordz);
    }
}
