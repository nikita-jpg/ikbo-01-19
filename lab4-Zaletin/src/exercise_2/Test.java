package exercise_2;

public class Test {
    public static void main(String[] args) {
        Priceable book = new Book(3_000.0D);
        Priceable iPad = new IPad(50_000.0D);

        System.out.println("Book: " + book.getPrice());
        System.out.print("IPad: " + iPad.getPrice());
    }
}