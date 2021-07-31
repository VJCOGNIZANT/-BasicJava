package com.oops;

public interface Interface2 {
    default String display(){
        return "inteface2 class display";
    }

    class Employee {
        Integer salary;
        int EmpId;
        String EmpName;

        void display() {
            System.out.println(EmpId);
            System.out.println(EmpName);
            System.out.println(salary);
        }

        public static void main(String args[]) {
            Employee object = new Employee();
            object.display();
        }
    }
}

