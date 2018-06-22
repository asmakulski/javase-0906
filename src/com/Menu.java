package com;

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

    public void nonStaticMethod(){
        System.out.println("To jest wywolanie metody nie-statycznej");
    }

    public static void staticMethod(){
        System.out.println("To jest wywolanie metody statycznie");
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }





}
