package option1;

public class Husky extends Dog {

    public Husky(String name, int weight, int height, char gender) {
        super(name,weight, height, gender);
    }

    @Override
    public void voice() {
        System.out.println("Barks for 10 minutes with a happy face");
    }

    @Override
    public void jump() {
        System.out.println("Jumps through everything possible, including you");
    }

    @Override
    public void lieDown() {
        System.out.println("Can't lie down for more than 10 seconds");
        for(int i=10;i>0;i--) {
            System.out.println("left " + i + " сек.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        jump();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
