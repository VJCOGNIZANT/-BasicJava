package com;

import java.util.ArrayList;
import java.util.List;

class Source {

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printList(random);
    }

    public static void printList(List<Float> arr) {
        int size=arr.size()-1;
        for(Float num : arr) {
            System.out.println(arr.get(size));
            size--;
        }
    }
}