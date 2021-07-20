package objects;

import javafx.scene.image.Image;
import simulation.GameParameters;

public class Ball {

    private final int radius;
    private final Position position;
    private int directionX;
    private int directionY;

    public Ball(int radius)
    {
        this.radius = radius;
        this.position = new Position(GameParameters.INIT_BALL_X, GameParameters.INIT_BALL_Y);
    }

    public Ball(int radius, Position position)
    {
        this.radius = radius;
        this.position = position;
    }

    public void move()
    {
        int x = position.getX() + directionX;
        int y = position.getY() + directionY;
        this.position.setX(x);
        this.position.setY(y);

        if(position.getX() == 0)
            this.directionX = 1;

        if(position.getX() == GameParameters.WINDOW_WIDTH - radius)
            this.directionX = -1;

        if(position.getY() == GameParameters.WINDOW_HEIGHT - radius)
            this.directionY = -1;

    }

    public Image loadImage()
    {
        return new Image("/Ball.png", 2*radius, 2*radius, true, true);
    }

    public Position getPosition() {
        return position;
    }
}
