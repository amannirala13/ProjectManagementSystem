package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.database.project.DBProject;
import com.amannirala13.projectmanagement.helper.Helper;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CreateProjectController {

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
    public void reset(){
        projectIdText.setText("");
    }

    @FXML
    public void submit(){
        String projectName = projectNameText.getText();
        String startDate = projectStartDate.getText();
        String endDate = projectEndDate.getText();
        String bufferDays = projectBufferDaysText.getText();

        boolean status = DBProject.createProject(
                projectName,
                startDate,
                endDate,
                bufferDays,
                false
        );

        if(!status)
            System.out.println("Unable to create project!!");
        else System.out.println("Created project");
    }


}

