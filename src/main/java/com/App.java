package com;

interface A{
    static void check(){
        System.out.println("A's check");
   }
   default  void display(){
       System.out.println("A's default display");
   }
   void sum(int a, int b);

    default void panga(){
        System.out.println("A's default panga");
    }
}

interface B{
    static void deep(){
        System.out.println("B's deep");
    }
    default void show(){
        System.out.println("A's default display");
    }
    void minus(int a, int b);

    default void panga(){
        System.out.println("A's default panga");
    }

}
class OurClass implements  A, B{
    @Override
    public void sum(int a, int b) {
        System.out.println("OurClass sum");
    }

    @Override
    public void panga() {
        System.out.println("OurClass panga");
    }

    @Override
    public void minus(int a, int b) {
        System.out.println("OurClass minus 2 args");
    }

    public void minus(int a, int b, int c) {
        System.out.println("OurClass minus 3 args");
    }
    public static void statCheck(){
        System.out.println("OurClass statCheck");
    }

}

public class App {
    public  static void main(String args[]){


        //invoking static methods
        A.check();
        B.deep();
        // method names== implentation
        OurClass obj =new OurClass();
        obj.minus(2,4);
        obj.minus(2,4, 7);
        obj.sum(3,5);
        OurClass.statCheck();
        obj.display();
        obj.show();
        obj.panga();


        A aObj = new OurClass();
        aObj.sum(2,3);
        aObj.display();
        aObj.panga();


        B bObj = new OurClass();
        bObj.minus(2,4);
        bObj.show();
        bObj.panga();

    }

}


