package com.example.administrator.patterndesign.CommandPattern;

public class BackCommand implements  Command {
    private Solid solid;

    public BackCommand(Solid solid) {
        this.solid = solid;
    }
    @Override
    public void exect() {
        solid.back();
    }
}
