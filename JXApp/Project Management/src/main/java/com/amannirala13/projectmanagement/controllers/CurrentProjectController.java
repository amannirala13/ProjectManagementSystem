package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CurrentProjectController {
    @FXML
    public void back(){
        SceneNavigation.getInstance(null).activateScreen(Routes.DASHBOARD);
    }

    @FXML
    private Label startDate;
    @FXML
    private Label endDate;
    @FXML
    private Label bufferDays;
    @FXML
    private Label projStatus;
}
