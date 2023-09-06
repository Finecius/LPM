public class Car implements CarbonFootprint {
    public String combustivel;
    public float cilindrada;

    public Car(String combustivel, float cilindrada) {
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    @Override
    public double getCarbonFootprint() {
        return 10;
    }
}
