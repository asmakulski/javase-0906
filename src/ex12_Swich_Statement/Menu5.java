package ex12_Swich_Statement;

public class Menu5 {

    private int number;
    private String text;
    private Possibilities5 myPossibilities5;

    public Menu5(){
        number = 5;
        text = "text field initialized from within non-argument constructor";
    }

    public Menu5(int number){
        this.number = number;
    }

    public Menu5(int number, String text){
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

    public Possibilities5 getMyPossibilities5() {
        return myPossibilities5;
    }

    public void setMyPossibilities5(Possibilities5 myPossibilities5) {
        this.myPossibilities5 = myPossibilities5;
    }
}