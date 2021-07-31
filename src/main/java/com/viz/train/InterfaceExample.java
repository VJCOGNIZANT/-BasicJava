package com.viz.train;
public interface InterfaceExample {
    String displayName();
    int Sum();
    default String message(){
        return "you are at message method of InterfaceExample";
    }
    public static String check(){
        return "checked";
    }
}
