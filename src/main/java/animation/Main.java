package animation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start (Stage theStage) throws Exception
    {
        AnchorPane pane = new AnchorPane();
        Controller controller = new Controller();
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("/BrickBreakerWindow.fxml"));

        fxml.setController(controller);
        pane.getChildren().add(fxml.load());
        Scene scene = new Scene(pane);
        theStage.setScene(scene);
        theStage.setTitle("Brick Breaker!");
        theStage.show();
    }
}
