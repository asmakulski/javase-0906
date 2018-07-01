package ex09_Int_vs_Integer;

public class Main2 {

    //te zmienne musza byc na zewnatrz metody main, bo bedac w metodzie main sa lokalnymi i nie maja domyslnych wartosci.
    //dla ulatwienia sa rowniez static, zeby nie trzeba bylo tworzyc obiektu do ich wywolania
    public static int varInt;
    public static Integer varInteger;

    public static void main(String[] args) {

        System.out.println("[Wyswietlenie domyslnych wartosci zmiennych int oraz Integer]");
        System.out.println(varInt);
        System.out.println(varInteger);

    }
}
