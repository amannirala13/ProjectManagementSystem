package com.amannirala13.projectmanagement;

import com.amannirala13.projectmanagement.database.DBConnector;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    SceneNavigation sceneNavigation;
    DBConnector dbConnector;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        sceneNavigation = SceneNavigation.getInstance(scene);
        dbConnector = DBConnector.get_instance();

        sceneNavigation.addScreen("dashboard", FXMLLoader.load(getClass().getResource("Dashboard.fxml")));


        sceneNavigation.activateScreen("dashboard");

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}