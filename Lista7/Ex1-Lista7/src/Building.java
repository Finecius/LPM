public abstract class Building implements CarbonFootprint{
    private int np;
    private boolean er;
    private int nl;
    private boolean ar;

    public Building(int np, boolean er, int nl, boolean ar) {
        this.np = np;
        this.er = er;
        this.nl = nl;
        this.ar = ar;
    }

    @Override
    public double getCarbonFootprint() {
        return 12;
    }
}
