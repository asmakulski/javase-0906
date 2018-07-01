package Ex11_If_Statement;

public class Main4 {

    public static void main(String[] args) {

        Menu4 menu1 = new Menu4(3);
        Menu4 menu2 = new Menu4(2);

        if(menu2.getNumber() >= menu1.getNumber()){
            menu1.setMyPossibilities4(Possibilities4.OPTION1);
            menu2.setMyPossibilities4(Possibilities4.OPTION2);
            System.out.println("Warunek if spelniony: " + menu1.getMyPossibilities4() + " " + menu2.getMyPossibilities4());
        }
        else{
            menu1.setMyPossibilities4(Possibilities4.OPTION3);
            menu2.setMyPossibilities4(Possibilities4.OPTION4);
            System.out.println("Warunek else spelniony: " + menu1.getMyPossibilities4() + " " + menu2.getMyPossibilities4());
        }
    }
}
