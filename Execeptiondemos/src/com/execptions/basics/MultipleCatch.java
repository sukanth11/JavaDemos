package com.execptions.basics;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println("welcome");
            String value=args[0];
            System.out.println("value "+value);
            int num=Integer.parseInt(value);
            System.out.println("number "+num);
            int result=100/num;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException aie){
            System.out.println(aie.getMessage());
            System.out.println("please enter the value");
        }catch (NumberFormatException ne){
            System.out.println(ne.getMessage());
            System.out.println("Don't enter 0");
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
            System.out.println("please enter the number");
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        System.out.println("complete......");
    }
}
