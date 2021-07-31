package com.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

    public static void main(String args[]){
       List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(56);
        list.add(98);
        list.add(78);
        List<String> list2=new ArrayList<>();
        list2.add("ram");
        list2.add("rohan");
        list2.add("shyam");
        list2.add("lakhan");
        System.out.println(list);
        Map<Integer,List> map=new HashMap<>();
        map.put(1,list);
        map.put(2,list2);
        System.out.print(map);
    }
}
