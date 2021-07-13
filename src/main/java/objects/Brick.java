package objects;

import java.util.Comparator;

public class Brick implements Comparable<Brick>{

    private int x;
    private int y;
    private int height;
    private int width;

    public Brick(int x, int y, int  height, int width)
    {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public int compareTo(Brick brick)
    {
        return Comparator.comparing(Brick::getX).reversed().thenComparing(Brick::getY).compare(this, brick);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
