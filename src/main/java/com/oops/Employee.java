package com.oops;

public class Employee {
    private int empId;
    private String name;
    public Employee(){
        System.out.println("calling default");
    }
    public Employee(int empId, String name){
        System.out.println("calling parameterized");
        this.empId=empId;
        this.name=name;
    }
    public void setEmpId(int empId ) {
        System.out.println("calling setEmpId");
        this.empId=empId;
    }
    public void setName(String name ) {
        System.out.println("calling setName");
       this.name=name;
    }
    public int getEmpId() {
        System.out.println("calling getEmpId");
        return empId;
    }
    public String getName() {
        System.out.println("calling getName");
        return name;
    }

    public static void main(String args[]){
    Employee obj=new Employee(); // obj =object ====>Employee{id=,name=}
    obj.setEmpId(3);
    obj.setName("Anjali");
    System.out.println(obj.getEmpId()+", "+obj.getName());
    //obj =object ====>Employee{id=3,name=}
    /*Employee obj=new Employee(3,"Anjali");
    System.out.println(obj.getEmpId()+", "+obj.getName());*/

}

//output
    // calling default
    //3
// int =0; Interger=null

    //calling getEmpId
    //calling setEmpId










}
