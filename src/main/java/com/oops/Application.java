package com.oops;

import java.util.*;

public class Application {
    public static void main(String args[]){
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        System.out.println(random.contains((float)5.0));
    }

}
