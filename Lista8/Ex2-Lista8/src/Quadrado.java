public class Quadrado extends FormaBidimensional implements AreaCalculavel{
    @Override
    public void calcularArea() {
    obterArea();
    }

    protected double l;

    public Quadrado(double l) {
        if (l<=0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0");
        }
        else
        this.l = l;
    }

    @Override
    public double obterArea() {

       return super.obterArea()*(l*l);
    }
}
