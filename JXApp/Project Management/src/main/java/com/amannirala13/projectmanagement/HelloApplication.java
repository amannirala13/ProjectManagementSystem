package com.amannirala13.projectmanagement;

import com.amannirala13.projectmanagement.database.DBConnector;
import com.amannirala13.projectmanagement.database.auth.DBAuth;
import com.amannirala13.projectmanagement.database.store.DataStore;
import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    SceneNavigation sceneNavigation;
    DBConnector dbConnector;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        sceneNavigation = SceneNavigation.getInstance(scene);
        dbConnector = DBConnector.getInstance();
        DataStore.loadProjects();
        DataStore.loadTasks();
        sceneNavigation.addScreen(Routes.DASHBOARD, FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml"))));
        sceneNavigation.addScreen(Routes.CREATE_NEW_PROJECT, FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CreateProject1.fxml"))));
        sceneNavigation.addScreen(Routes.CURRENT_PROJECTS, FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CurrentProjects.fxml"))));
        sceneNavigation.addScreen(Routes.PROJECT_PAGE, FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ProjectPage.fxml"))));
        sceneNavigation.addScreen(Routes.TASK_PAGE, FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TaskPage.fxml"))));


        sceneNavigation.activateScreen(Routes.DASHBOARD);

        stage.setTitle("Project Management System");
        stage.initStyle(StageStyle.DECORATED);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}