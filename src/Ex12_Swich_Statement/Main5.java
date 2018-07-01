package Ex12_Swich_Statement;

public class Main5 {

    public static void main(String[] args) {

        Menu5 menu1 = new Menu5(3);
        Menu5 menu2 = new Menu5(2);

        switch (menu2.getNumber() - menu1.getNumber()){
            case 0:
                menu1.setMyPossibilities5(Possibilities5.OPTION5);
                menu2.setMyPossibilities5(Possibilities5.OPTION6);
                System.out.println("Warunek switch case 0 spelniony: " + menu1.getMyPossibilities5() + " " + menu2.getMyPossibilities5());
                break;
            case 1:
                menu1.setMyPossibilities5(Possibilities5.OPTION6);
                menu2.setMyPossibilities5(Possibilities5.OPTION7);
                System.out.println("Warunek switch case 1 spelniony: " + menu1.getMyPossibilities5() + " " + menu2.getMyPossibilities5());
                break;
            case 2:
                menu1.setMyPossibilities5(Possibilities5.OPTION7);
                menu2.setMyPossibilities5(Possibilities5.OPTION8);
                System.out.println("Warunek switch case 2 spelniony: " + menu1.getMyPossibilities5() + " " + menu2.getMyPossibilities5());
                break;
            case 3:
                menu1.setMyPossibilities5(Possibilities5.OPTION8);
                menu2.setMyPossibilities5(Possibilities5.OPTION10);
                System.out.println("Warunek switch case 3 spelniony: " + menu1.getMyPossibilities5() + " " + menu2.getMyPossibilities5());
                break;
            default:
                System.out.println("Warunek default spelniony. Wynikiem jest liczba ujemna lub wieksza od trzech");

        }
    }
}
