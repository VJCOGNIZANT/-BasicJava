package com.anju.basic;

public abstract class AbsClass1 {
    private int i;
    public AbsClass1(int i){
        System.out.print("AbsClass1 constructor");
        this.i=i;
    }

    public abstract void flagging() ;

    public void display(){
        System.out.println("AbsClass1");
    }
}
