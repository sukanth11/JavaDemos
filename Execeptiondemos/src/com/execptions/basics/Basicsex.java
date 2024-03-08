package com.execptions.basics;

public class Basicsex {
    public static void main(String[] args) {
        try{
            System.out.println("welcome");
            String value=args[0];
            System.out.println("value"+value);
            int num=Integer.parseInt(value);
            System.out.println("number"+num);
            int result=100/num;
            System.out.println(result);

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("continue......");
    }
}
