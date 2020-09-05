package option1;

public abstract class Dog {
    private String name;
    private int weight;
    private int height;
    private char gender;


    public Dog(String name, int weight, int height, char gender) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public abstract void voice();
    public abstract void jump();
    public abstract void lieDown();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }
}
