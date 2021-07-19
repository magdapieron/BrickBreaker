package objects;

import javafx.scene.image.Image;

public class Ball {

    private int radius;
    private Position position;

    public Ball(int radius, Position position)
    {
        this.radius = radius;
        this.position = position;
    }

    public void move(int x, int y)
    {

    }

    public Image loadImage()
    {
        return new Image("/Ball.png", 2*this.radius, 2*this.radius, true, true);
    }

    public int getRadius() {
        return radius;
    }

    public Position getPosition() {
        return position;
    }
}
