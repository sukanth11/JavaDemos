package com.userapp.service;

public interface Ivalidationservice {
    boolean validatepassward(String passward)throws TooShortExeception,TooLongException;


}
