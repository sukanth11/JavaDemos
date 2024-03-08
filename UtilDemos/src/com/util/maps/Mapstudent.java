package com.util.maps;

import java.util.*;

public class Mapstudent {
    public static void main(String[] args) {
        Map<Department, List<Student>> student=new HashMap<>();
        Department department1=new Department("sukanth","cse",1);
        Department department2=new Department("kalandhar","me",2);
        Department department3=new Department("nikhil","civil",3);

        student.put(department1, (Arrays.asList(new Student("sukanth","bengluru"),
                new Student("kishor","Tumkur"),
                new Student("kavya","chenagiri"))));

        student.put(department2, (Arrays.asList(new Student("sukanth","bengluru"),
                new Student("kishor","Tumkur"),
                new Student("kavya","chenagiri"))));

        student.put(department3, (Arrays.asList(new Student("sukanth","bengluru"),
                new Student("kishor","Tumkur"),
                new Student("kavya","chenagiri"))));

        Set<Department> departments=student.keySet();
        for (Department department:departments){
            System.out.println(department.getDeptHead()+" "+department.getDeptname());
            List<Student> students=student.get(department);
            for (Student student1:students){
                System.out.println(student1.getStudname());
            }
        }

    }
}
