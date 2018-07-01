package Ex15_Equality_Of_Objects;

public class Main9_EqualityOfObjects {

    public static void main(String[] args) {

        String textA = new String("simple text");
        String textB = new String("simple text");

        if(textA == textB){
            System.out.println("Equality == is true");
        }
        else {
            System.out.println("Equality == is false");
        }

        if(textA.equals(textB)){
            System.out.println("Equality equals is true");
        }
        else {
            System.out.println("Equality equals is false");
        }
        System.out.println("textA hashCode: " + textA.hashCode());
        System.out.println("textB hashCode: " + textB.hashCode());
    }
}
