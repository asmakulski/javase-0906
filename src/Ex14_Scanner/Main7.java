package Ex14_Scanner;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        System.out.println("Podaj kolor samochodu: ");
        car.setColor(scanner.next());
        System.out.println("Podaj moc samochodu w km: ");
        car.setPower(scanner.nextInt());
        System.out.println("Samochod ma " + car.getColor() + " kolor i ma " + car.getPower() + "km");




    }
}
