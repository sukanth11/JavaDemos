package com.object.inheritence;

public class Teamone extends Project{
    String techstack;

    public Teamone(String projectname, int durationmonths, String domain, String projectmanager, String techstack) {
        super(projectname, durationmonths, domain, projectmanager);
        this.techstack = techstack;
    }
    String[] showtechstack(){
        String[] string={"java","Html","css"};
        return string;
    }
}
