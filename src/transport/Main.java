package transport;
public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание");
        DriverB DriverB = new DriverB("Иван", true, 4);
        DriverC DriverC = new DriverC("Павел", true, 7);
        DriverD DriverD = new DriverD("Игорь", true, 8);
        Car car1 = new Car("Lada", "Granta", 1.8D, DriverB);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0D, DriverB);
        Car car3 = new Car("BMW", "Z8",3.0D, DriverB);
        Car car4 = new Car("Kia", "Sportage 4", 2.4D, DriverB);

        Bus bus1 = new Bus("Нефаз", "Городской", 4.0, DriverD);
        Bus bus2 = new Bus("Белфаз", "Первый", 4.3, DriverD);
        Bus bus3 = new Bus("Икарус", "Второй", 4.2, DriverD);
        Bus bus4 = new Bus("Москвич", "Третий", 4.5, DriverD);

        Truck truck1 = new Truck("Камаз", "Первый", 5.0, DriverC);
        Truck truck2 = new Truck("Камаз", "Второй", 5.5, DriverC);
        Truck truck3 = new Truck("Камаз", "Третий", 5.8, DriverC);
        Truck truck4 = new Truck("Камаз", "Четвертый", 5.2, DriverC);
        printInfoRace(car1);
        printInfoRace(car2);
        printInfoRace(car3);
        printInfoRace(car4);
        printInfoRace(bus1);
        printInfoRace(bus2);
        printInfoRace(bus3);
        printInfoRace(bus4);
        printInfoRace(truck1);
        printInfoRace(truck2);
        printInfoRace(truck3);
        printInfoRace(truck4);
    }

    private static void printInfoRace(Transport transport) {
        System.out.println("водитель "+ transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand()+ " " +transport.getModel() + " и будет участвовать в заезде");
    }
}

interface Competing {
    void pitStop();
    void bestTimeOfLap();
    void  maxSpeed();
}