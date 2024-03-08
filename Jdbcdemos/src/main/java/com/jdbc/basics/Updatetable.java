package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatetable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";

        try(Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();) {
            String sql = "update employee set city='bengaluru' where employeeid=303102;";
            boolean result = statement.execute(sql);
            System.out.println("update data " + !result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("data updated");
    }
}
