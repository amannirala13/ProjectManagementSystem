package com.amannirala13.projectmanagement.navigation;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

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

    protected void addScreen(String name, Pane pane){
        sceneMap.put(name, pane);
    }

    protected void removeScreen(String name){
        sceneMap.remove(name);
    }

    protected void activateScreen(String name){
        main.setRoot(sceneMap.get(name));
    }

}
