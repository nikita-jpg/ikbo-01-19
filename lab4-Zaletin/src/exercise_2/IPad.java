package exercise_2;

public class IPad implements Priceable {
    private final double jacketPrice;

    public IPad(double jacketPrice) {
        this.jacketPrice = jacketPrice;
    }

    public double getPrice() {
        return this.jacketPrice;
    }
}