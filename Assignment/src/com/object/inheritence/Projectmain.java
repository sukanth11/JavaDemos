package com.object.inheritence;

public class Projectmain {
    public static void main(String[] args) {
        String[] toolss={"git","intellij","vscode"};
        Project project=new Project("financial",12,"developer","sukanth");
        project.showprojectdetails();

        Teamone teamone=new Teamone("bankupi",24,"testing","kishor","javafullstack");
        String[] techstack=teamone.showtechstack();
        for (String tech:techstack){
            System.out.println(tech);
        }

        Teamtwo teamtwo=new Teamtwo("phonepi",20,"maintain","prajwal",toolss);
        teamtwo.showsupporttools();

    }
}
