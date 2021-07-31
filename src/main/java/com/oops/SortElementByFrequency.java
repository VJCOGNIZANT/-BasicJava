package com.oops;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortElementByFrequency {

    public static void main(String args[]){
        int arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

    }
}
/*
map(3,4);
map(2,3);
map(12,2);
map(4,1);
map(5,1);
*/