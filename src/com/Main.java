package com;

public class Main {

    public static void main(String[] args) {

        //obiekt strorzony poprez bezparametrowy kontruktor
        Menu myMenuNoParam = new Menu();
        System.out.println(myMenuNoParam.number);
        System.out.println(myMenuNoParam.text);

        //obiekt stworzony poprez kontruktor z dwoma parametrami
        Menu myMenuTwoParams = new Menu(11, "string");
        System.out.println(myMenuTwoParams.number);
        System.out.println(myMenuTwoParams.text);


        //wywolanie metody void
        myMenuNoParam.methodReturningNothing();
        myMenuTwoParams.methodReturningNothing();

        //wywolanie metwody getnumber()
        System.out.println(myMenuTwoParams.getNumber());

        //wywolanie metody nie-statycznej z wymaganym utworzeniem obiektu
        Menu menu = new Menu();
        menu.nonStaticMethod();

        //wywolanie metody statycznej bez wymogu utworzenia obiektu
        Menu.staticMethod();

        //ustawienie pol metody Menu za pomoca setterow i wyswietlenie za pomoca getterow
        Menu menu1 = new Menu();
        menu1.setNumber(6);
        menu1.setText("text ustawiony text przez settera");
        System.out.println(menu1.getNumber());
        System.out.println(menu1.getText());

    }
}
