//package com.example.administrator.patterndesign.CompositePattern;
//
//import org.jetbrains.annotations.NotNull;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RootComponet  extends Componet{
//
//       public RootComponet(Document document) {
//           super(null);
//       }
//    @Override
//    String getTitle() {
//        return "updateStep";
//    }
//    @Override
//    Componet getComponet(Element element) {
//        return new UpdateStep(element);
//    }
//}
