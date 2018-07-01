package ex15_Equality_Of_Objects;

public class Main8_EqualityOfStrings {

    public static void main(String[] args) {

        String textA = "simple text";
        String textB = "simple text";

        if(textA == textB){
            System.out.println("Equality == is true");
        }
        else{
            System.out.println("Equality == is false");
        }

        if(textA.equals(textB)){
            System.out.println("Equality equals is true");
        }
        else{
            System.out.println("Equality equals is false");
        }
        System.out.println("textA hashCode: " + textA.hashCode());
        System.out.println("textB hashCode: " + textB.hashCode());
    }
}
