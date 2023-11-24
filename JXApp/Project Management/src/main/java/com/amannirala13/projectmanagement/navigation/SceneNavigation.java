package com.amannirala13.projectmanagement.navigation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/**
 * Used for navigation and scene transformation
 * @author Aman Kumar Nirala
 */
public class SceneNavigation {
    private static SceneNavigation _singleInstance = null;
    private HashMap <String, Pane> sceneMap= new HashMap<>();
    private Scene main;


    public static synchronized SceneNavigation getInstance(Scene main){
        if (_singleInstance == null)
            _singleInstance = new SceneNavigation(main);
        return _singleInstance;
    }

    public SceneNavigation(Scene main){
        this.main = main;
    }

    public void addScreen(String name, Pane pane) throws IOException {
        sceneMap.put(name, pane);
    }

    public void removeScreen(String name){
        sceneMap.remove(name);
    }

    public void activateScreen(String name){
        main.setRoot(sceneMap.get(name));
    }

}
