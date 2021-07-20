package objects;

import javafx.scene.image.Image;

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

    public Image loadImage()
    {
        return new Image("/Brick.png", width, height, true, true);
    }

    public boolean destroyed()
    {
        return thickness == 0;
    }

    @Override
    public int compareTo(Brick brick)
    {
        return Comparator.comparing(Position::getX).reversed().thenComparing(Position::getY).compare(this.getPosition(), brick.getPosition());
    }

    public Position getPosition() {
        return position;
    }
}
