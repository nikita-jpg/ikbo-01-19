package option1;

public class Alabay extends Dog {

    public Alabay(String name, int weight, int height, char gender) {
        super(name,weight, height, gender);
    }

    @Override
    public void voice() {
        System.out.println("That's a good boy is a boss here. It doesn't obey you ");
    }

    @Override
    public void jump() {
        System.out.println("Jumps out at you. Time to call an ambulance");
    }

    @Override
    public void lieDown() {
        System.out.println("It's already there");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
