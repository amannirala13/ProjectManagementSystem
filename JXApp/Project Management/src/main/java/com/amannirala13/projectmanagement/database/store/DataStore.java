package com.amannirala13.projectmanagement.database.store;

import com.amannirala13.projectmanagement.database.project.DBProject;
import com.amannirala13.projectmanagement.database.task.DbTask;
import com.amannirala13.projectmanagement.models.ProjectModel;
import com.amannirala13.projectmanagement.models.TaskModel;
import com.amannirala13.projectmanagement.models.UserModel;

import java.util.ArrayList;

public class DataStore {
    public static ArrayList<ProjectModel> projectsDataStore = new ArrayList<>();
    public static ArrayList<TaskModel> taskModelArrayList = new ArrayList<>();
    public static ArrayList<UserModel> userModelArrayList = new ArrayList<>();

    public static void loadProjects(){
        projectsDataStore =  DBProject.getProjects();
    }

    public static void loadTasks(){
        taskModelArrayList = DbTask.getTasks();
    }

}
