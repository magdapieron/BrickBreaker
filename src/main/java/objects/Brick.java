package objects;

import java.util.Comparator;

public class Brick implements Comparable<Brick>{


    private final int height;
    private final int width;
    private final Position position;
    private int thickness;

    public Brick(int  height, int width, Position position, int thickness)
    {
        this.height = height;
        this.width = width;
        this.position = position;
        this.thickness = thickness;
    }

    public void hit()
    {
        this.thickness -=1;
    }

    public int destroyed()
    {
        return thickness;
    }

    @Override
    public int compareTo(Brick brick)
    {
        return Comparator.comparing(Position::getX).reversed().thenComparing(Position::getY).compare(this.getPosition(), brick.getPosition());
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Position getPosition() {
        return position;
    }
}
