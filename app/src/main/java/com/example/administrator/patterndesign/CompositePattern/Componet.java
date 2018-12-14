//package com.example.administrator.patterndesign.CompositePattern;
//
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public abstract class  Componet {
//
//    protected List<Componet> componets;
//    public Componet(Element element){
//        if (element==null){
//
//            return ;
//        }
//        NodeList nodeList = element.getElementsByTagName(getTitle());
//        componets=new ArrayList<>();
//        for (int i = 0; i <nodeList.getLength(); i++)
//        {
//            Element db = (Element) (nodeList.item(i));
//            Componet componet =getComponet(db);
//            this.addComponet(componet);
//        }
//    }
//    public void addComponet(Componet componet) {
//        componets.add(componet);
//    }
//
//    public List<Componet> getComponets() {
//        return componets;
//    }
//
//    public void setComponets(List<Componet> componets) {
//        this.componets = componets;
//    }
//
//    abstract String getTitle();
//    abstract Componet getComponet(Element element);
//}
