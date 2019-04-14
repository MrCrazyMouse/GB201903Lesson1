package gbjavacore.lesson4.FX;

import gbjavacore.lesson4.FX.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class JavaFxApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene.fxml"));
        Parent root = loader.load();
        Controller ctrl = loader.getController();
        ctrl.setPrimaryStage(primaryStage);

        primaryStage.setTitle("Основа для чата");
        Scene scene = new Scene(root);
        // как установить стиль из кода
        scene.getStylesheets().add(getClass().getResource("/css/dark-theme.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(450);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }
}
