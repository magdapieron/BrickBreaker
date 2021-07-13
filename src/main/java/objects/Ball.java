package objects;

import javafx.scene.image.Image;

public class Ball {

    private int x;
    private int y;
    private int radius = 5;

    public Ball(int windowWidth)
    {
        this.x = windowWidth/2;
        this.y = 20;
    }

    public Ball(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public Image loadImage()
    {
        return new Image("/Ball.png", radius, radius, true, true);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}
