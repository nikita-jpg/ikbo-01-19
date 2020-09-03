package classes;

public class Ball {
    private int ballRadius;
    private boolean isInflate;

    public Ball(int ballRadius)
    {
        this.ballRadius = ballRadius;
        isInflate = false;
    }

    public String toString()
    {
        return String.valueOf(ballRadius);
    }

    public boolean isInflate() {
        return isInflate;
    }

    public void inflate()
    {
        isInflate = true;
    }

    public void unInflate() {
        isInflate = false;
    }
}
