package com.amannirala13.projectmanagement.navigation;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.HashMap;

/**
 * Navigator used for route based navigation in JavaFx.
 *
 * @author Aman Kumar Nirala
 */
public class SceneNavigation {
    private static SceneNavigation _singleInstance = null;

    private static String indentData = null;
    private HashMap <Routes, Pane> sceneMap= new HashMap<>();
    private Scene main;


    public static synchronized SceneNavigation getInstance(Scene main){
        if (_singleInstance == null)
            _singleInstance = new SceneNavigation(main);
        return _singleInstance;
    }

    public static void setIndentData(String data){
        SceneNavigation.indentData = data;
    }

    public static String getIndentData(){
        return SceneNavigation.indentData;
    }

    public SceneNavigation(Scene main){
        this.main = main;
    }

    public void addScreen(Routes route, Pane pane) throws IOException {
        sceneMap.put(route, pane);
    }

    public void removeScreen(Routes route){
        sceneMap.remove(route);
    }

    public void activateScreen(Routes routes){
        main.setRoot(sceneMap.get(routes));
    }

}
