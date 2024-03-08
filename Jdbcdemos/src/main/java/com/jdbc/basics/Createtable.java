package com.jdbc.basics;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class Createtable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        try(Connection connection=DriverManager.getConnection(url,username,password);

        Statement  statement=connection.createStatement();) {

            String sql = "create table employee(name varchar(20),employeeId int primary key,city varchar(20))";

            boolean result=statement.execute(sql);
            System.out.println("Table created" + !result);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("done");
    }
}
