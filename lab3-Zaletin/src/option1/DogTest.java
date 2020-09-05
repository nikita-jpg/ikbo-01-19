package option1;

public class DogTest {
    public static void main(String args[])
    {
        System.out.println("HuskyTest");
        Husky husky = new Husky("Good boy",10,10,'M');
        System.out.println(husky.toString());
        System.out.println("Command voice");
        husky.voice();
        System.out.println("Command jump");
        husky.jump();
        System.out.println("Command lieDown");
        husky.lieDown();

        System.out.println();
        Alabay alabay = new Alabay("Good boy",100,5,'M');
        System.out.println(alabay.toString());
        System.out.println("Command voice");
        alabay.voice();
        System.out.println("Command jump");
        alabay.jump();
        System.out.println("Command lieDown");
        alabay.lieDown();
    }
}
