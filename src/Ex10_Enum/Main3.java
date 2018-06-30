package Ex10_Enum;

public class Main3 {

    public static void main(String[] args) {

        //odwolanie do klasy Enum4 jak do metody statycznej
        Car car = new Car(EnumCarBodyType.COUPE, 340);

        System.out.println(car.power);
        System.out.println(car.bodyType);


    }
}
