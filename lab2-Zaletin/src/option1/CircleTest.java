package option1;

public class CircleTest {
    public static void main(String args[])
    {
        Circle circle = new Circle(10,1,1);
        System.out.println(circle.toString());

        circle.setRadius(15);
        circle.setX(0);
        circle.setY(0);
        System.out.println(circle.toString());
    }
}
