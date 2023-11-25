package com.amannirala13.projectmanagement.database.task;

import com.amannirala13.projectmanagement.database.DBConnector;
import com.amannirala13.projectmanagement.models.ProjectModel;
import com.amannirala13.projectmanagement.models.TaskModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbTask {

    public static boolean createTask(String projectId,
                                     String title,
                                     String note,
                                     String startDate,
                                     String durationInDays,
                                     boolean completed) {

        TaskModel projectModel = new TaskModel(
                projectId,
                title,
                null,
                note,
                startDate,
                durationInDays,
                completed,
                null
        );

        return DBConnector.getInstance().runUpdateQuery(
                String.format("INSERT INTO projects VALUES( '%s', '%s', '%s', '%s', '%s', '%s', %s)",
                        projectModel.getProjectId(),
                        projectModel.getTitle(),
                        projectModel.getNote(),
                        projectModel.getStartDate(),
                        projectModel.getDurationInDays(),
                        projectModel.isCompleted()));
    }

    public static ArrayList<TaskModel> getTasks(){
        ArrayList<TaskModel> tasks = new ArrayList<>();
        ResultSet resultSet = DBConnector.getInstance().runSelectQuery("SELECT * FROM tasks;");
        try{
            while(resultSet.next()){
                TaskModel projectModel = new TaskModel(
                        resultSet.getString("projId"),
                        resultSet.getString("taskName"),
                        null,
                        resultSet.getString("note"),
                        resultSet.getString("startDate"),
                        resultSet.getString("duration"),
                        resultSet.getBoolean("complete"),
                        null);

                tasks.add(projectModel);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return tasks;
    }
}
