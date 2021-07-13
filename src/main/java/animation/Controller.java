package animation;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import simulation.Engine;

public class Controller {

    private Engine engine;
    private GraphicsContext gc;

    @FXML
    Canvas animation;

    public Controller()
    {
        this.engine = new Engine(400, 500);
        this.gc = animation.getGraphicsContext2D();
    }

    public void initialize()
    {
        gc.drawImage(engine.getBall().loadImage(), engine.getBall().getX() + engine.getBall().getRadius(), engine.getBall().getY() + engine.getBall().getRadius());
        gc.drawImage(engine.getPlatform().loadImage(), engine.getPlatform().getX() + engine.getPlatform().getWidth(), engine.getPlatform().getY() + engine.getPlatform().getHeight());
    }
}
