package com.example.administrator.patterndesign.ProxyPattern.proxy1;

import java.io.File;

public class RealProxy implements Image {
    private File file;
    public RealProxy(String firlname) {
        file=  getFileFromFileName(firlname);
    }
    @Override
    public void display() {
        System.out.println(file.getAbsoluteFile());
    }
   private File getFileFromFileName(String firlname){
       System.out.println("获取文件");
       return new File(firlname);
   }
}
