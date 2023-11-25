package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.database.DBConnector;
import com.amannirala13.projectmanagement.database.project.DBProject;
import com.amannirala13.projectmanagement.helper.Helper;
import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import java.sql.ResultSet;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ProjectPageController {

    



    @FXML
    public void showList() {
        ResultSet resultSet = DBConnector.getInstance().runSelectQuery("SELECT * FROM tasks;");
        
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

