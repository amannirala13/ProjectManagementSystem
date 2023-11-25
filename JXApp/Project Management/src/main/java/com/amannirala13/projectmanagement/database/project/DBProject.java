package com.amannirala13.projectmanagement.database.project;

import com.amannirala13.projectmanagement.database.DBConnector;
import com.amannirala13.projectmanagement.helper.Helper;
import com.amannirala13.projectmanagement.models.ProjectModel;
import com.amannirala13.projectmanagement.models.TaskModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class DBProject {

    public static boolean createProject(
            String title,
            String startDate,
            String endDate,
            String bufferDays,
            boolean completed){

        ProjectModel projectModel = new ProjectModel(
                Helper.generateUUID(),
                title,
                null,
                startDate,
                endDate,
                bufferDays,
                null,
                completed
        );

        /**
         * for (String owner : owners){
            boolean ownerStatus;
            ownerStatus = DBConnector.getInstance().runUpdateQuery(
                    String.format("INSERT INTO project_owners VALUES %s, %s", projectModel.getProjectId(), owner)
            );

            if(!ownerStatus)
                return false;
        }**/

        return DBConnector.getInstance().runUpdateQuery(
                String.format("INSERT INTO projects VALUES( '%s', '%s', '%s', '%s', '%s', %s)",
                        projectModel.getProjectId(),
                        projectModel.getTitle(),
                        projectModel.getStartDate(),
                        projectModel.getEndDate(),
                        projectModel.getBufferDays(),
                        projectModel.isCompleted()));
    }

    public static ArrayList<ProjectModel> getProjects(){
        ArrayList<ProjectModel> projects = new ArrayList<>();
        ResultSet resultSet = DBConnector.getInstance().runSelectQuery("SELECT * FROM projects;");
        try{
            while(resultSet.next()){
                ProjectModel projectModel = new ProjectModel(
                        resultSet.getString("id"),
                        resultSet.getString("title"),
                        null,
                        resultSet.getString("startDate"),
                        resultSet.getString("endDate"),
                        resultSet.getString("bufferDays"),
                        null,
                        resultSet.getBoolean("complete")
                );

                projects.add(projectModel);
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return projects;
    }

}
