package transport;
public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание");
        Car car1 = new Car("   ", "Granta", 0, "Россия", null, 0, "Ручная", "Седан", "У111УУ 116", 0, true, new Car.Key(true, true));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 3.0D, "Автомат", "Седан", "У222УУ 116", 5, true, new Car.Key(true, true));
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "Черный", 3.0D, "Автомат", "Седан", "У333УУ 116", 5, false, new Car.Key(true, true));
        Car car4 = new Car("Kia", "Sportage 4", 2018, "Южная Корея", "Красный", 2.4D, "Автомат", "Кроссовер", "У444УУ 116", 5, true, new Car.Key(true, true));
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6D, "Автомат", "Седан", "У555УУ 116", 5, false, new Car.Key(true, true));
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        Car.Key key = new Car.Key(true, false);


    }
}