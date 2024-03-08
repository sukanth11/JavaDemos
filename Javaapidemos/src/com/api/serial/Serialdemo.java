package com.api.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialdemo {
    public static void main(String[] args) {
        Student student=new Student("sukanth",303102,"cse");
        System.out.println("serializing");

        try(FileOutputStream fileOutputStream=new FileOutputStream("stud.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            ) {
            objectOutputStream.writeObject(student);
            System.out.println("task completed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
