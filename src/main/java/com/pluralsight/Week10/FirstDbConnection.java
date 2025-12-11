package com.pluralsight.Week10;

import java.sql.*;

public class FirstDbConnection {
    public static void main(String[] args) {
        try {

            // Step 1: Open the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql: //localhost:3306/sakila", "root", "yearup");

            // Step 2: Create a statement (query holder)
            Statement statement = connection.createStatement();

            // Step 3a: execute the query
            String query = "SELECT * FROM city";
            ResultSet resultSet = statement.executeQuery(query);

            //Step 3b: process the result
            while(resultSet.next()) {
                System.out.println(resultSet.getString("city"));
            }

            // Step 4: we close the connection
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
