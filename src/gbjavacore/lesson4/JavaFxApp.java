package gbjavacore.lesson4;

import gbjavacore.lesson1.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class JavaFxApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primeryStage){
        primeryStage.setTitle("Сетевой чат");
        primeryStage.setScene(new Scene(new StackPane(),300,300));
        primeryStage.show();
    }
}
