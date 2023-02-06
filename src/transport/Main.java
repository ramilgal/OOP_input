package transport;

import static transport.Capacity.*;
import static transport.BodyType.*;
import static transport.LoadCapacity.*;


public class Main {
    public static void main(String[] args)  {
        System.out.println("Домашнее задание");
        DriverB DriverB = new DriverB("Иван", true, 4);
        DriverC DriverC = new DriverC("Павел", true, 7);
        DriverD DriverD = new DriverD("Игорь", true, 8);
        Car car1 = new Car("Lada", "Granta", 1.8D, DriverB,SEDAN);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0D, DriverB, SEDAN);
        Car car3 = new Car("BMW", "Z8",3.0D, DriverB, SEDAN);
        Car car4 = new Car("Kia", "Sportage 4", 2.4D, DriverB, CROSSOVER);

        Bus bus1 = new Bus("Нефаз", "Городской", 4.0, DriverD, BIG);
        Bus bus2 = new Bus("Белфаз", "Первый", 4.3, DriverD, SMALL);
        Bus bus3 = new Bus("Икарус", "Второй", 4.2, DriverD, VERY_BIG);
        Bus bus4 = new Bus("Москвич", "Третий", 4.5, DriverD, MIDDLE);

        Truck truck1 = new Truck("Камаз", "Первый", 5.0, DriverC,N1);
        Truck truck2 = new Truck("Камаз", "Второй", 5.5, DriverC, N2);
        Truck truck3 = new Truck("Камаз", "Третий", 5.8, DriverC, N3);
        Truck truck4 = new Truck("Камаз", "Четвертый", 5.2, DriverC, N3);
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
        System.out.println();
        System.out.println(car1);
        System.out.println();
        System.out.println(bus1);
        System.out.println();
        System.out.println(truck1);
        System.out.println();
        try {
            car1.passDiagnostic();
            bus1.passDiagnostic();
            bus2.passDiagnostic();
            truck1.passDiagnostic();
            bus1.passDiagnostic();
            car2.passDiagnostic();
        } catch (TransportTypeException e) {
            e.printStackTrace();
            System.out.println("Автобусам проходить диагностику не нужно");
        }
//        try {
//            bus1.passDiagnostic();
//        } catch (TransportTypeException e) {
//            throw new TransportTypeException("Автобус не может проходить диагностику");
//            //System.out.println("Автобусам проходить диагностику не нужно");
//        }


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
