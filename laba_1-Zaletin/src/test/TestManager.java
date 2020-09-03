package test;

public class TestManager {
    public void start()
    {
        TestDog testDog = new TestDog();
        testDog.start();
        System.out.println();

        TestBook testBook = new TestBook();
        testBook.start();
        System.out.println();

        TestBall testBall = new TestBall();
        testBall.start();
        System.out.println();
    }
}
