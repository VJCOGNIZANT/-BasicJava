package com.oops;

public class ChildClass implements  Interface1,Interface2{
    private void check(){
        System.out.print("blank");
    }

    @Override
    public String display() {
        return Interface1.super.display();
    }
}
