public class Bottle extends Product {
    private double volume;

    public Bottle(int id, double price, String name, double volume) {
        super(id, price, name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " " + volume + "л.";
    }

}
