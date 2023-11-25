package com.amannirala13.projectmanagement.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.amannirala13.projectmanagement.database.DBConnector;
import com.amannirala13.projectmanagement.database.project.DBProject;
import com.amannirala13.projectmanagement.helper.Helper;
import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import java.sql.ResultSet;

public class ProjectPageController {
    @FXML
    private Label projectName;

    @FXML
    private Label startDate;
    @FXML
    private Label endDate;
    @FXML
    private Label bufferDays;
    @FXML
    private Label projectStatus;
    @FXML
    private Label remainingDays;

    



    @FXML
    public void showList() {
        ResultSet resultSet = DBConnector.getInstance().runSelectQuery("SELECT * FROM projects;");
        
    }

    @FXML
    public void addTask(){
    }
    
    @FXML
    public void delete(){
    }

    @FXML
    public void back(){
        SceneNavigation.getInstance(null).activateScreen(Routes.DASHBOARD);
    }
    
    @FXML
    public void home(){
        SceneNavigation.getInstance(null).activateScreen(Routes.DASHBOARD);
    }
}

