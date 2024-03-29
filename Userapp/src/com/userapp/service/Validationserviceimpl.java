package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationserviceImpl implements Ivalidationservice {

    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if(password.length()<6)
            throw new TooShortException("Entered password is too short");
        if (password.length()>15)
            throw new TooLongException("Entered password is too long");
        return true;
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames={"sukanth","kishor","nikhal","guru"};
        for (String name:usernames)
            throw new NameExistsException("user name already exist");
        return true;
    }
}
