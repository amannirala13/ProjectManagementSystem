package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.models.TaskModel;
import com.amannirala13.projectmanagement.models.ProjectModel;
import java.util.Date;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CreateProject {

    @FXML
    public Label reset;
    
    @FXML
    public TextField ProjectID;
    
    @FXML
    public TextField ProjectName;
    
    @FXML
    public TextField StartDate;
    
    @FXML
    public TextField EndDate;
    
    @FXML
    public TextField BufferDays;
    
    
    @FXML
    public reset() {
       ProjectID.clear();
       ProjectName.clear();
       StartDate.clear();
       EndDate.clear();
       BufferDays.clear();
    }
    
    @FXML
    public void submit() {
        setProjectId(ProjectID.getText());
        setTitle(ProjectName.getText());
        setStartDate(StartDate.getText());
        setEndDate(EndDate.getText());
        setBufferDays(BufferDays.getText());
}
}
