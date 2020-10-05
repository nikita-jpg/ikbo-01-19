package exercise_1;

public class Book implements Nameable {
    private final String objName;

    public Book(String objName) {
        this.objName = objName;
    }

    @Override
    public String getNameUsingOverriding() {
        return this.objName;
    }
}