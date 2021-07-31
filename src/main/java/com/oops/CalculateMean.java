package com.oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculateMean {
    public static void main(String args[]){
        File file=new File("/Users/c_vijendra.singh/temp/practice/quiz_numbers.txt");
        double mean=0.0;
        try {
            Scanner input=new Scanner(file);
            int sum=0;
            int count=0;
            while(input.hasNext()){
                sum=sum+input.nextInt();
                count++;
            }
            mean =(double)sum/(double)count;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        System.out.println("mean: "+mean);


    }
}
