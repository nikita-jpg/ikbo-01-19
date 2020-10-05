package exercise_1;

public class Author implements Nameable {
    private final String objName;

    public Author(String objName) {
        this.objName = objName;
    }

    @Override
    public String getNameUsingOverriding() {
        return this.objName;
    }
}