package com.object.inheritence;

public class Project {
    String projectname;
    int durationmonths;
    String domain;
    String projectmanager;

    public Project(String projectname, int durationmonths, String domain, String projectmanager) {
        this.projectname = projectname;
        this.durationmonths = durationmonths;
        this.domain = domain;
        this.projectmanager = projectmanager;
    }

    void showprojectdetails(){
        System.out.println("projectname: "+projectname);
        System.out.println("durationmonths: "+durationmonths);
        System.out.println("domain: "+domain);
        System.out.println("projectmanager: "+projectmanager);

    }
}
