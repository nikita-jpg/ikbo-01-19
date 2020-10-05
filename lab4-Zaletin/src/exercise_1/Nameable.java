package exercise_1;

public interface Nameable {
    String getNameUsingOverriding();
    default String getNameUsingDefaultMethod() {
        return this.getClass().getSimpleName();
    }
}