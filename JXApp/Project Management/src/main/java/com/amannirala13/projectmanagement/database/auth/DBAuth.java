package com.amannirala13.projectmanagement.database.auth;

import com.amannirala13.projectmanagement.database.DBConnector;
import com.amannirala13.projectmanagement.helper.Helper;
import com.amannirala13.projectmanagement.models.UserModel;

public class DBAuth {
    public static boolean createUser(String name, String role, String department){
        UserModel md = new UserModel(
                Helper.generateUUID(),
                name,
                role,
                department);

        DBConnector dbConnector = DBConnector.getInstance();

        boolean success = dbConnector.runUpdateQuery(
                String.format("INSERT INTO users VALUES('%s', '%s', '%s', '%s');",
                        md.getId(), md.getName(), md.getRole(), md.getDepartment())
        );

        if(success){
            System.out.println("User created"+ " with ID: "+ md.getId());
        }
        else{
            System.out.println("User creation failed");
        }
        return success;
    }
}
