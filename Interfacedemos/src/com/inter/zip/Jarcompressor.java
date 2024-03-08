package com.inter.zip;

public class Jarcompressor implements Icompressor {
    @Override
    public String[] compressfiles(String files1, String files2) {
        String[] jarfiles=new String[3];
        jarfiles[0]="demo.java";
        jarfiles[1]="demo1.java";
        return jarfiles;
    }
}
