package com.anju.basic;

public class Service extends AbsClass1{
    public Service(int id) {
        super(id);
        System.out.println("Service's class constructor");

    }

    @Override
    public void flagging() {
        System.out.println("Service's class flagging");

    }

    public void serviceMethod1(){
        System.out.println("Service's class serviceMethod1");
        }
    }
