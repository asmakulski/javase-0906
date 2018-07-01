package ex01_08_Constructors_Methods;

public class Main {

    public static void main(String[] args) {

        //obiekt stworzony poprez bezparametrowy kontruktor
        Menu myMenuNoParam = new Menu();
        System.out.println("[Wyswietlenie wartosci pol dla obiektu stworzonego poprzez kontruktor bezparametrowy]");
        System.out.println(myMenuNoParam.number);
        System.out.println(myMenuNoParam.text + "\n");

        //obiekt stworzony poprez kontruktor z dwoma parametrami
        Menu myMenuTwoParams = new Menu(11, "text field initialized via parameter");
        System.out.println("[Wyswietlenie przypisanych wartosci pol dla obiektu stworzonego poprzez kontruktor parametrowy]");
        System.out.println(myMenuTwoParams.number);
        System.out.println(myMenuTwoParams.text + "\n");

        //wywolanie metody void
        System.out.println("[Wywolanie metody void methodReturningNothing() wypisujacej tekst dla dwoch konstruktorow (bezparametrowy i parametrowy)]");
        myMenuNoParam.methodReturningNothing();
        myMenuTwoParams.methodReturningNothing();
        System.out.println();

        //wywolanie metwody getnumber()
        System.out.println("[Wywolanie metody getNumber() zwracajacej wartosc pola number dla dwoch konstruktorow (bezparametrowy i parametrowy)]");
        System.out.println(myMenuNoParam.getNumber());
        System.out.println(myMenuTwoParams.getNumber() + "\n");

        System.out.println("[Wywolanie metod statycznej i nie-statycznej]");
        //wywolanie metody nie-statycznej z wymaganym utworzeniem obiektu
        Menu menu = new Menu();
        menu.nonStaticMethod();
        //wywolanie metody statycznej bez wymogu utworzenia obiektu
        Menu.staticMethod();
        System.out.println();

        //ustawienie pol metody Menu5 za pomoca setterow i wyswietlenie za pomoca getterow
        System.out.println("[Ustawienie pol metody Menu5 za pomoca setterow oraz pobranie i wyswietlenie za pomoca getterow]");
        Menu menu1 = new Menu();
        menu1.setNumber(6);
        menu1.setText("tekst ustawiony przez settera");
        System.out.println(menu1.getNumber());
        System.out.println(menu1.getText() + "\n");

    }
}
