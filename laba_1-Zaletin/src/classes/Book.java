package classes;

public class Book {
    private String bookName;
    private boolean isOpen;

    public Book(String bookName)
    {
        this.bookName = bookName;
        isOpen = false;
    }

    public String toString()
    {
        return bookName;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open()
    {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }
}
