public class FormaTridimensional extends Forma{
    protected double v;
protected double At;


        public double obterArea(){
         return At;
        }
        public double obterVolume(){
           return v;
        }


    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getAt() {
        return At;
    }

    public void setAt(double at) {
        At = at;
    }
}
