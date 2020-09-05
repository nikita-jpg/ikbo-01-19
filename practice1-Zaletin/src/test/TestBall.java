package test;


import classes.Ball;

public class TestBall {
    private int ballRadius;
    private Ball ball;
    public void start()
    {
        ballRadius = 15;
        ball = new Ball(ballRadius);
        testRadius();
        testCommand();
    }

    private void testCommand()
    {
        ball.inflate();

        if(ball.isInflate() == true)
            System.out.println("Команда 'надуть' работает правильно");
        else
            System.out.println("Команда 'надуть' работает неправильно");

        ball.unInflate();

        if(ball.isInflate() == false)
            System.out.println("Команда 'сдуть' работает правильно");
        else
            System.out.println("Команда 'сдуть' работает неправильно");
    }

    private void testRadius()
    {
        if(ball.toString().equals(String.valueOf(ballRadius)))
            System.out.println("Радиус мяча работает правильно");
        else
            System.out.println("Радиус мяча работает не правильно");
    }
}
