package com.amannirala13.projectmanagement.controllers;

import com.amannirala13.projectmanagement.database.project.DBProject;
import com.amannirala13.projectmanagement.database.store.DataStore;
import com.amannirala13.projectmanagement.database.task.DbTask;
import com.amannirala13.projectmanagement.helper.Helper;
import com.amannirala13.projectmanagement.navigation.Routes;
import com.amannirala13.projectmanagement.navigation.SceneNavigation;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

public class TaskController {

    @FXML
    private TextField TaskName;
    @FXML
    private TextField StartDate;
    @FXML
    private TextField Duration;
    @FXML
    private TextField Note;



    @FXML
    public void reset() {
        TaskName.setText("");
        StartDate.setText("");
        Duration.setText("");
        Note.setText("");
    }

    @FXML
    public void submit(){
        String taskName = TaskName.getText();
        String startDate = StartDate.getText();
        String duration = Duration.getText();
        String note = Note.getText();

        boolean success = DbTask.createTask(
                DataStore.projectsDataStore.get(Integer.parseInt(SceneNavigation.getIndentData())).getProjectId(),
                taskName,
                note,
                startDate,
                duration,
                false
        );

        if(!success) {
            System.out.println("Unable to create task!!");
        }
        else {
            System.out.println("Created Task");
            reset();
            DataStore.loadTasks();
            SceneNavigation.getInstance(null).activateScreen(Routes.CURRENT_PROJECTS);
        }
    }

    @FXML
    public void back(){
        SceneNavigation.getInstance(null).activateScreen(Routes.DASHBOARD);
    }
}

