package exercise_A;

public class TestAuthor {
    public static void main(String args[]){
        Author author = new Author("Pushkin","pushkin@yandex.ru",'M');
        System.out.println(author.toString());
        author.setName("Tolstoy");
        author.setEmail("tolstoy@yandex.ru");
        author.setGender('M');
        System.out.println(author.toString());
    }
}
