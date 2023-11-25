package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.database.project.DBProject;
import com.amannirala13.projectmanagement.helper.Helper;
import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TaskController {

    @FXML
    private TextField projectIdText;
    @FXML
    private TextField projectNameText;
    @FXML
    private TextField projectStartDate;
    @FXML
    private TextField projectEndDate;
    @FXML
    private TextField projectBufferDaysText;



    @FXML
    public void reset() {
        projectIdText.setText("");
        projectNameText.setText("");
        projectStartDate.setText("");
        projectEndDate.setText("");
        projectBufferDaysText.setText("");
    }

    @FXML
    public void submit(){
        String projectName = projectNameText.getText();
        String startDate = projectStartDate.getText();
        String endDate = projectEndDate.getText();
        String bufferDays = projectBufferDaysText.getText();

        String projectID = DBProject.createProject(
                projectName,
                startDate,
                endDate,
                bufferDays,
                false
        );

        if(projectID == null) {
            System.out.println("Unable to create project!!");
        }
        else {
            System.out.println("Created project");
            reset();
        }
    }

    @FXML
    public void back(){
        SceneNavigation.getInstance(null).activateScreen(Routes.DASHBOARD);
    }
}

