public class Bicycle implements CarbonFootprint {
    private String marca;
    private int Ta;

    public Bicycle(String marca, int ta) {
        this.marca = marca;
        Ta = ta;
    }

    @Override
    public double getCarbonFootprint() {
        return 22;
    }

}
