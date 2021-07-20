package animation;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import objects.Ball;
import objects.Brick;
import simulation.Engine;
import simulation.GameParameters;

public class Controller {

    private final Engine engine;
    private final GraphicsContext gc;

    public Controller(GraphicsContext gc)
    {
        this.engine = new Engine();
        this.gc = gc;
    }

    public void initialize()
    {
        gc.drawImage(engine.getPaddle().loadImage(), GameParameters.INIT_PADDLE_X, GameParameters.INIT_PADDLE_Y);

        for(Brick brick : engine.getBricks())
            gc.drawImage(brick.loadImage(), brick.getPosition().getX(), brick.getPosition().getY());

        for (Ball ball : engine.getBall())
            gc.drawImage(ball.loadImage(), GameParameters.INIT_BALL_X, GameParameters.INIT_BALL_Y);

    }
}
