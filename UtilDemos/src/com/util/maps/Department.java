package com.util.maps;

public class Department {
    private String  deptHead;
    private String  deptname;
    private int  deptid;

    public Department() {
    }

    public Department(String deptHead, String deptname, int deptid) {
        this.deptHead = deptHead;
        this.deptname = deptname;
        this.deptid = deptid;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptHead='" + deptHead + '\'' +
                ", deptname='" + deptname + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}
