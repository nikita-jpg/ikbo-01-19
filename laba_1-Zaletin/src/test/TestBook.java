package test;

import classes.Book;

public class TestBook {
    private String bookName;
    private Book book;
    public void start()
    {
        bookName = "Pushkin";
        book = new Book(bookName);
        testName();
        testCommand();
    }

    private void testCommand()
    {
        book.open();

        if(book.isOpen() == true)
            System.out.println("Команда 'открыть' работает правильно");
        else
            System.out.println("Команда 'открыть' работает правильно");

        book.close();

        if(book.isOpen() == false)
            System.out.println("Команда 'закрыть' работает правильно");
        else
            System.out.println("Команда 'закрыть' работает неправильно");
    }

    private void testName()
    {
        if(bookName.equals(book.toString()))
            System.out.println("Название книги работает правильно");
        else
            System.out.println("Название книги работает не правильно");
    }
}
