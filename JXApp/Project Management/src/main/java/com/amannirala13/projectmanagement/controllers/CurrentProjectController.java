package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.fxml.FXML;

public class CurrentProjectController {
    @FXML
    public void back(){
        SceneNavigation.getInstance(null).activateScreen(Routes.DASHBOARD);
    }
}
