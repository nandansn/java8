package com.nanda.java8.durga.lambda;

public interface Display {

    public void m();

    default public void m5(){

        System.out.println("display");

    }


    public static void m1(){
        System.out.println("interface display static");
    }


}

interface ChildDisplay extends Display{

    public static void m2(){

    }

}

interface Display2{
    //public void m();
    default public void m5(){
        System.out.println("display2");
    }

    public static void m1(){
        System.out.println("interface display2 static");
    }
}

class PhoneDisplay implements  Display2, ChildDisplay{

    static PhoneDisplay d = new PhoneDisplay();

    static {
        d.m();
        d.m5();

        PhoneDisplay.m1();

    }



    public static void main(String args[]){

        PhoneDisplay d = new PhoneDisplay();
        m1();



    }

    @Override
    public void m() {
        Display.m1();
        Display2.m1();


        // or //

    }

    @Override
    public void m5() {
        ChildDisplay.super.m5();
        Display2.super.m5();
    }

    public static void m1(){
        System.out.println("Phone display");
    }


}
