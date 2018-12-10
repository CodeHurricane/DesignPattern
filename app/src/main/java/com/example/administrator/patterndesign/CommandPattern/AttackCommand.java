package com.example.administrator.patterndesign.CommandPattern;

public class AttackCommand implements Command {
    private Solid solid;

    public AttackCommand(Solid solid) {
        this.solid = solid;
    }

    @Override
    public void exect() {
        solid.attack();
    }
}
