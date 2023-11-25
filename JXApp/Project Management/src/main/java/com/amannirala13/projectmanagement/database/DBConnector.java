package com.amannirala13.projectmanagement.database;

import java.sql.*;

/**
 * Utility for connecting to database using JDBC and running
 * select and update commands.
 *
 * @author Sayanee Ghosh
 */
public class DBConnector {
    private static DBConnector _instance = null;
    private final String driverName = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://db4free.net:3306/production_13130";
    private final String userName = "aman13";
    private final String password = "amAn1313";

    private Connection connection = null;

    public static synchronized DBConnector getInstance() {
        if(_instance == null)
            _instance = new DBConnector();

        return _instance;
    }

    public DBConnector(){
        try{
            Class.forName(driverName).newInstance();
        } catch (Exception e ){
            System.out.println(e.getMessage());
        }
        try{
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }

    public ResultSet runSelectQuery(String query){
        Statement statement;
        ResultSet resultSet = null;

        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        return resultSet;
    }

    public boolean runUpdateQuery(String query){
        Statement statement;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
