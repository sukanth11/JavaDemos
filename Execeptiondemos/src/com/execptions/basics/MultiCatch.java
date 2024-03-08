package com.execptions.basics;

public class MultiCatch {
    public static void main(String[] args) {
        try{
            System.out.println("welcome");
            String value=args[0];
            System.out.println("value "+value);
            int num=Integer.parseInt(value);
            System.out.println("number "+num);
            int result=100/num;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("please enter the number");
        }catch (RuntimeException re){
            System.out.println(re.getMessage());
            System.out.println("runtime exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("exception handled");
        }
        System.out.println("complete......");
    }
}
