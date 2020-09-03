package classes;

public class Dog {
    private String dogName;
    private boolean isSit;

    public Dog(String dogName)
    {
        this.dogName = dogName;
        isSit = false;
    }

    public String toString()
    {
        return dogName;
    }

    public boolean isSit() {
        return isSit;
    }

    public void up()
    {
        isSit = true;
    }

    public void sit() {
        isSit = true;
    }
}
