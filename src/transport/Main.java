package transport;
public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание");
        Car car1 = new Car("   ", "Granta", -1,"Россия", "Красный", 1.8,"Автомат", "Седан", "У111УУ 116", 5, true, new Car.Key(true, true), 210);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 3.0D, "Автомат", "Седан", "У222УУ 116", 5, true, new Car.Key(true, true), 230);
        Car car3 = new Car("BMW", "Z8",2021, "Германия", "Черный", 3.0D, "Автомат", "Седан", "У333УУ 116", 5, false, new Car.Key(true, true), 220);
        Car car4 = new Car("Kia", "Sportage 4", 2018, "Южная Корея", "Красный", 2.4D, "Автомат", "Кроссовер", "У444УУ 116", 5, true, new Car.Key(true, false), 250);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 1.6D, "Автомат", "Седан", "У555УУ 116", 5, false, new Car.Key(true, false), 240);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        Car.Key key = new Car.Key(true, false);
        System.out.println(key);
        car3.ChangeTiresForSeasonal(8);
        System.out.println(car3);
        Bus bus = new Bus("Нефаз", "Городской", 2020, "", "Россия", 120);
        Bus bus1 = new Bus("Камаз", "Первый", 2019, "Белый", " ", 100);
        Bus bus2 = new Bus("Камаз", "Второй", 0, "Синий", "Россия", 110);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
    }
}