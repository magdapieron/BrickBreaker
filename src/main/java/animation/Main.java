package animation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import objects.LevelParameters;

public class Main extends Application{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start (Stage theStage) throws Exception
    {
        int windowWidth = 400;
        int windowHeight = 500;

        AnchorPane root = new AnchorPane();


        final Canvas canvas = new Canvas(windowWidth,windowHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Scene scene = new Scene(root, windowWidth, windowHeight, Color.PALETURQUOISE);
        root.getChildren().add(canvas);
        theStage.setScene(scene);
        theStage.setTitle("Brick Breaker!");
        theStage.show();

        Controller controller = new Controller(gc, windowWidth, windowHeight);
        controller.initialize();
    }
}
