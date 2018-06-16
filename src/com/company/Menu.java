package com.company;

public class Menu {

    int number;
    String text;

    //konstruktor bezparametrowy
    public Menu(){
        number = 5;
        text = "this is a test";
    }

    public Menu(int number, String text){
        this.number = number;
        this.text = text;
    }

    public void methodReturningNothing(){
        System.out.println("message from void method");
    }

    public int getNumber(){
        return number;
    }

}
