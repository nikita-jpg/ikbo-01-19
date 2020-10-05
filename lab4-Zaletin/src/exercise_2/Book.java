package exercise_2;

public class Book implements Priceable {
    private final double carPrice;

    public Book(double carPrice) {
        this.carPrice = carPrice;
    }

    public double getPrice() {
        return this.carPrice;
    }
}