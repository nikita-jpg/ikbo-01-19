package test;

import classes.Dog;

public class TestDog {
    private String dogName;
    private Dog dog;
    public void start()
    {
        dogName = "Sharik";
        dog = new Dog(dogName);
        testName();
        testCommand();
    }

    private void testCommand()
    {
        dog.sit();

        if(dog.isSit() == true)
            System.out.println("Команда 'сидеть' работает правильно");
        else
            System.out.println("Команда 'сидеть' работает правильно");

        dog.up();

        if(dog.isSit() == false)
            System.out.println("Команда 'встать' работает правильно");
        else
            System.out.println("Команда 'встать' работает правильно");
    }

    private void testName()
    {
        if(dogName.equals(dog.toString()))
            System.out.println("Имя собаки работает правильно");
        else
            System.out.println("Имя собаки работает не правильно");
    }
}
