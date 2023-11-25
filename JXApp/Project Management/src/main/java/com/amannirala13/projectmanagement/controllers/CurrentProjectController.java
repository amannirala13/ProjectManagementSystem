package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.database.store.DataStore;
import com.amannirala13.projectmanagement.models.ProjectModel;
import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

public class CurrentProjectController {
    private int currentIndex=0;
    @FXML
    public void back(){
        SceneNavigation.getInstance(null).activateScreen(Routes.DASHBOARD);
    }

    @FXML
    private  Label projectName;
    @FXML
    private Label startDate;
    @FXML
    private Label endDate;
    @FXML
    private Label bufferDays;
    @FXML
    private Label projStatus;

    @FXML
    public void next(){
        if (currentIndex<DataStore.projectsDataStore.size()-1) {
            currentIndex++;
            ProjectModel pm = DataStore.projectsDataStore.get(currentIndex);
            projectName.setText(pm.getTitle());
            startDate.setText(pm.getStartDate());
            endDate.setText(pm.getEndDate());
            bufferDays.setText(pm.getBufferDays());
            projStatus.setText((!pm.isCompleted())?"Active":"Complete");
        }
    }

    public void prev(){
        if (currentIndex>0) {
            currentIndex--;
            ProjectModel pm = DataStore.projectsDataStore.get(currentIndex);
            projectName.setText(pm.getTitle());
            startDate.setText(pm.getStartDate());
            endDate.setText(pm.getEndDate());
            bufferDays.setText(pm.getBufferDays());
            projStatus.setText((!pm.isCompleted())?"Active":"Complete");
        }
    }
    public void initialize() {
        ProjectModel pm = DataStore.projectsDataStore.get(currentIndex);
        projectName.setText(pm.getTitle());
        startDate.setText(pm.getStartDate());
        endDate.setText(pm.getEndDate());
        bufferDays.setText(pm.getBufferDays());
        projStatus.setText((!pm.isCompleted())?"Active":"Complete");
    }

    @FXML
    public void addTask() {
        SceneNavigation.getInstance(null).activateScreen(Routes.TASK_PAGE);
        SceneNavigation.setIndentData(String.format("%s",currentIndex));
    }
}
