package exercise1_3;

public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
        super(side,side,null,false);
    }

    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide()
    {
        return length;
    }

    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "exercise1_3.Square{" +
                "side='" + getSide() + '\'' +
                ", color=" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
