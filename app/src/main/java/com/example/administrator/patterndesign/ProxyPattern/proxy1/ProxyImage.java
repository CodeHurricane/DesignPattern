package com.example.administrator.patterndesign.ProxyPattern.proxy1;

public class ProxyImage implements  Image {
   private RealProxy realProxy;

    public ProxyImage(String filename) {
        realProxy=new RealProxy(filename);
    }

    @Override
    public void display() {
        realProxy.display();
    }


}
