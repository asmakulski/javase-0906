package Ex01_08_Constructors_Methods;

public class Menu {

    int number;
    String text;

    //konstruktor bezparametrowy
    public Menu(){
        number = 5;
        text = "text field initialized from within non-argument constructor";
    }

    //konstruktor z dwoma parametrami
    public Menu(int number, String text){
        this.number = number;
        this.text = text;
    }

    public void methodReturningNothing(){
        System.out.println("Message from void method");
    }

    public void nonStaticMethod(){
        System.out.println("To jest wywolanie metody nie-statycznej, ktora wymaga utworzenia obiektu do jej wywolania");
    }

    public static void staticMethod(){
        System.out.println("To jest wywolanie metody statycznej, ktora nie wymaga utworzenia obiektu do jej wywolania");
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
