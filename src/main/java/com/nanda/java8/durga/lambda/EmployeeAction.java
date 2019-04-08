package com.nanda.java8.durga.lambda;

public class EmployeeAction {

    public static void main(String args[]){

        String empDetsils = new Emp(1,"Nanda").toString();

        System.out.println(empDetsils);
    }
}



class Emp{

    int eno;
    String name;

    public Emp(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                '}';
    }
}
