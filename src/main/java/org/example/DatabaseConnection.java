package org.example;

import java.sql.*;


public class DatabaseConnection {
    static Connection connection = null;
    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        String user = "root";
        String pwd = "Siddhi@#11";
        String db = "searchengineapp";
        return getConnection(user, pwd, db);
    }
    private static Connection getConnection(String user, String pwd, String db) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/searchengineapp","root","Siddhi@#11");
        }
        catch(SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
        return connection;
    }
}
