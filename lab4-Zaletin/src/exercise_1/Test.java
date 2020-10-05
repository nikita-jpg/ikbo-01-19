package exercise_1;

public class Test {
    public static void main(String[] args) {
        Nameable book = new Book("Книга");
        Nameable author = new Author("Автор");

        // С использованием переопределения
        System.out.println(book.getNameUsingOverriding());
        System.out.println(author.getNameUsingOverriding());
        // С использованием default метода
        System.out.println(book.getNameUsingDefaultMethod());
        System.out.print(author.getNameUsingDefaultMethod());
    }
}