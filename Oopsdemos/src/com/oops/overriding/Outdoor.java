package com.oops.overriding;

public class Outdoor extends Sports{
    @Override
    String[] showtypes() {
        return new String[]{"cricket","tennis","football","kabbadi"};
    }
}
