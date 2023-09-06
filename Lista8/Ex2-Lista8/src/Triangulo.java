public class Triangulo extends FormaBidimensional implements AreaCalculavel{
    @Override
    public void calcularArea() {
    obterArea();
    }

    protected double b;
    protected double h;

    public Triangulo(double b, double h) {
        if(b<=0 || h<=0){
            throw new IllegalArgumentException("Valor inválido, os valores esperados são maiores que 0");
        } else if (b==h) {
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores um dos valores a fim de torná-los diferentes");
        }
        else {
            this.b = b;
            this.h = h;
        }
    }

    @Override
    public double obterArea() {

        return super.obterArea()*((b*h)/2);
    }
}
