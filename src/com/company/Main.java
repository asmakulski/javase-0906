package com.company;

public class Main {

    public static void main(String[] args) {

        //obiekt strorzony poprez bezparametrowy kontruktor
        Menu myMenuNoParam = new Menu();
        System.out.println(myMenuNoParam.number);
        System.out.println(myMenuNoParam.text);

        //obiekt strorzony poprez kontruktor z dwoma parametrami
        Menu myMenuTwoParams = new Menu(11, "string");
        System.out.println(myMenuTwoParams.number);
        System.out.println(myMenuTwoParams.text);


        //wywolanie metody void
        myMenuNoParam.methodReturningNothing();
        myMenuTwoParams.methodReturningNothing();

        //wywolanie metwody getnumber()
        System.out.println(myMenuTwoParams.getNumber());
    }
}
