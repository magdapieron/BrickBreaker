package animation;

import javafx.scene.canvas.GraphicsContext;
import simulation.Engine;

public class Controller {

    private final Engine engine;
    private final int windowWidth;
    private final int windowHeight;
    private final GraphicsContext gc;

    public Controller(GraphicsContext gc, int windowWidth, int windowHeight)
    {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
        this.engine = new Engine(windowWidth, windowHeight);
        this.gc = gc;
    }

    public void initialize()
    {
        int ballX = engine.getBall().getPosition().getX() - engine.getParameters().ballRadius();
        int ballY = engine.getBall().getPosition().getY() - engine.getParameters().ballRadius();
        int platformX = engine.getPaddle().getPosition().getX() - engine.getParameters().platformWidth()/2;
        int platformY = engine.getPaddle().getPosition().getY();
        gc.drawImage(engine.getBall().loadImage(),ballX, ballY);
        gc.drawImage(engine.getPaddle().loadImage(), platformX , platformY );
    }
}
