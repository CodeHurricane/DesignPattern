package com.example.administrator.patterndesign.CommandPattern;

public class Client {

    public static void main(String[] args) {
        Solid solid=new Solid();

    Command commandattack=new AttackCommand(solid);
    Command commandback=new BackCommand(solid);

      commandattack.exect();
      commandback.exect();

    }
}
