package animation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import simulation.GameParameters;

public class Main extends Application{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start (Stage theStage) throws Exception
    {
        AnchorPane root = new AnchorPane();


        final Canvas canvas = new Canvas(GameParameters.WINDOW_WIDTH, GameParameters.WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Scene scene = new Scene(root, GameParameters.WINDOW_WIDTH, GameParameters.WINDOW_HEIGHT, Color.PALETURQUOISE);
        root.getChildren().add(canvas);
        theStage.setScene(scene);
        theStage.setTitle("Brick Breaker!");
        theStage.show();

        Controller controller = new Controller(gc);
        controller.initialize();
    }
}
