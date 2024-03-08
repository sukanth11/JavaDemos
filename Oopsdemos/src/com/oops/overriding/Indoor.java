package com.oops.overriding;

public class Indoor extends Sports{
    @Override
    String[] showtypes() {
        return new String[]{"chess","table tennis","carrom","kabbadi"};
    }
}
