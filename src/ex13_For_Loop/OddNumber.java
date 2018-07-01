package ex13_For_Loop;

public class OddNumber {

    public void searchForOdd (int number){

        for (int i=0; i<=number; i++){
            if (i % 2 == 0){
                continue;

            }
            if (i % 11 == 0 && i != 0){
                break;
            }
            System.out.println(i);

        }
    }
}
