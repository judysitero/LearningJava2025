package com.pluralsight.Week10;

import java.sql.*;

public class CloseWithTryWithResources {
    public static void main(String[] args) {
        // Step 3a: execute the query
        String query = "SELECT * FROM products";

        //***********************************************************************************************
        // This is related to the args[0], args[1] Maaike was showing us a better practice for passwords
        if(args.length < 2) {
            System.out.println("Can't run the application without two arguments");
            System.exit(1);
        }
        //***************************************************************************************************

        try(Connection connection = DriverManager.getConnection("jdbc:mysql: //localhost:3306/northwind", args[0], args[1]); // args[0], args[1]) is my user/pass hidden. To do this I go to 3 vertical dots, click edit and in the "Program arguments" box type root yearup just like that
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

        ) {
            //Step 3b: process the result
            while(resultSet.next()) {
                System.out.println(resultSet.getString("ProductName"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
