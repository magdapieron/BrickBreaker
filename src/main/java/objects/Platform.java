package objects;

import javafx.scene.image.Image;

public class Platform {

    private int x;
    private int y;
    private final int height;
    private int width;
    private final int windowWidth;

    public Platform(int windowWidth)
    {
        this.height = 2;
        this.width = 10;
        this.windowWidth = windowWidth;
        this.x = windowWidth-(width/2);
        this.y = 18;
    }

    public void move(int x)
    {
        if(this.x + x < 0)
            this.x = 0;
        else if(this.x + x > windowWidth)
            this.x = windowWidth;
        else
            this.x += x;
    }

    public Image loadImage()
    {
        return new Image("/Platform.png", width, height, true, true);
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

    public void setWidth(int width) {
        this.width = width;
    }
}
