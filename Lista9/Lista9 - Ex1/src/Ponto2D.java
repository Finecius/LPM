public class Ponto2D{

    private double cordx, cordy;

    public Ponto2D(double cordx, double cordy) {
        this.cordx = cordx;
        this.cordy = cordy;
    }

    public double getCordx() {
        return cordx;
    }

    public void setCordx(double cordx) {
        this.cordx = cordx;
    }

    public double getCordy() {
        return cordy;
    }

    public void setCordy(double cordy) {
        this.cordy = cordy;
    }

    @Override
    public String toString() {
        return ("Coordenada x: "+cordx+" e Coordenada y: "+ cordy);
    }
}
