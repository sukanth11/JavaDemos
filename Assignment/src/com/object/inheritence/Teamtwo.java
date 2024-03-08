package com.object.inheritence;

public class Teamtwo extends Project{
    String[] tools;

    public Teamtwo(String projectname, int durationmonths, String domain, String projectmanager, String[] tools) {
        super(projectname, durationmonths, domain, projectmanager);
        this.tools = tools;
    }
    void showsupporttools(){
        for (String tool:tools){
            System.out.println(tool);
        }
    }
}
