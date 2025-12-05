package com.pluralsight.Week10;

import java.sql.*;

public class CloseConnectionFinally {
    public static void main(String[] args) {
        Connection connection = null; //Declaring Connection outside of the try
        Statement statement = null; //same with Statement
        ResultSet resultSet = null; // and ResultSet
        try {

            // Step 1: Open the connection
            connection = DriverManager.getConnection("jdbc:mysql: //localhost:3306/northwind", "root", "yearup");

            // Step 2: Create a statement (query holder)
            statement = connection.createStatement();

            // Step 3a: execute the query
            String query = "SELECT * FROM products";
            resultSet = statement.executeQuery(query);

            //Step 3b: process the result
            while(resultSet.next()) {
                System.out.println(resultSet.getString("ProductName"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(connection != null)
                // Step 4: we close the connection
            {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
