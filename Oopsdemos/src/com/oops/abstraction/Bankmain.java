package com.oops.abstraction;

public class Bankmain {
    public static void main(String[] args) {
        Bank bank=new Branch1();
        bank.carloan();
        bank.houselone();
        bank.educationlone();
        bank.admin();
        Branch1 branch1=(Branch1)bank;
        branch1.payintrest();
        Bank bank1=new Subbranch();
        bank1.carloan();
        bank1.houselone();
        bank1.educationlone();
        bank1.admin();
        Subbranch subbranch=(Subbranch) bank1;
        subbranch.subpay();
        Branch2 branch2=new Subbranch();
        branch2.staffdetails();

    }
}
