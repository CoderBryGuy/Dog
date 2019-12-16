package com.company;

public class Static {

    private String name = "String";

    public static void one(){}
    public static void two(){}

    public static void three(){
        one();
        two();
//        four();
//

    }

    public void four(){
        one();
        two();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();
        //four();

        Static myInstance = new Static();
        myInstance.four();
        new Static().four();
    }

}
