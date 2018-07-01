package Ex11_If_Statement;

public class Menu4 {

    private int number;
    private String text;
    private Possibilities4 myPossibilities4;

    public Menu4(){
        number = 5;
        text = "text field initialized from within non-argument constructor";
    }

    public Menu4(int number){
        this.number = number;
    }

    public Menu4(int number, String text){
        this.number = number;
        this.text = text;
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

    public Possibilities4 getMyPossibilities4() {
        return myPossibilities4;
    }

    public void setMyPossibilities4(Possibilities4 myPossibilities4) {
        this.myPossibilities4 = myPossibilities4;
    }
}