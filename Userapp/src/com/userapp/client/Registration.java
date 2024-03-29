package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.Ivalidationservice;
import com.userapp.service.ValidationserviceImpl;

import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter username");
        String username=scanner.next();
        boolean usernameFlag=false;
        Ivalidationservice ivalidationservice=new ValidationserviceImpl();
        try {
            usernameFlag=ivalidationservice.validateUsername(username);
        } catch (NameExistsException e) {
            System.out.println(e.getMessage());
        }
        if (usernameFlag==true){
            System.out.println("Enter password");
            String pass= scanner.next();
            boolean passwordFlag=false;
            try {
                passwordFlag =ivalidationservice.validatePassword(pass);
            } catch (TooShortException | TooLongException e) {
                System.out.println(e.getMessage());
            }
            if (passwordFlag==true){
                System.out.println("password is created");
            }
        }
    }
}
