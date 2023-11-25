package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML
    public void gotoCurrentProject(){
        SceneNavigation.getInstance(null).activateScreen(Routes.CURRENT_PROJECTS);
    }

    @FXML
    public void gotoNewProject(){
        SceneNavigation.getInstance(null).activateScreen(Routes.CREATE_NEW_PROJECT);
    }
}
