package objects;

import javafx.scene.image.Image;
import simulation.GameParameters;

public class Paddle {

    private final int width;
    private final int height;
    private Position position;

    public Paddle(int width, int height, Position position)
    {
        this.height = height;
        this.width = width;
        this.position = position;
    }

    public void move(int x)
    {
        if(position.getX() + x < 0)
            this.position.setX(0);

        else if(position.getX() + x + width > GameParameters.WINDOW_WIDTH)
            this.position.setX(GameParameters.WINDOW_WIDTH);

        else
            this.position.setX(x);
    }

    public Image loadImage()
    {
        return new Image("/Paddle.png", width, height, true, true);
    }

    public Position getPosition() {
        return position;
    }
}
