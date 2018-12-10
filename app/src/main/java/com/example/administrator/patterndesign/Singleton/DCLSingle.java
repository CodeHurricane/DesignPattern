package com.example.administrator.patterndesign.Singleton;

public class DCLSingle {
  private  DCLSingle dclSingle;

  private DCLSingle(){}

    public DCLSingle getDclSingle(){
      synchronized (DCLSingle.class){
          if (dclSingle==null){
              synchronized (DCLSingle.class){
                  dclSingle=new DCLSingle();
              }
          }
      }
        return dclSingle;
    }
}
