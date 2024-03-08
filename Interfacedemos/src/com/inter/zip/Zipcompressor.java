package com.inter.zip;

public class Zipcompressor implements Icompressor {
    @Override
    public String[] compressfiles(String files1, String files2) {
        String[] zippedfiles=new String[2];
        zippedfiles[0]=files1;
        zippedfiles[1]=files2;
        return zippedfiles;
    }
}
