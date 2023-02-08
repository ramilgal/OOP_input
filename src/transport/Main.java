package transport;

import java.util.*;

import static transport.Capacity.*;
import static transport.BodyType.*;
import static transport.LoadCapacity.*;


public class Main {
    public static void main(String[] args) {


        System.out.println("Домашнее задание");
        DriverB DriverB = new DriverB("Иван", true, 4);
        DriverC DriverC = new DriverC("Павел", true, 7);
        DriverD DriverD = new DriverD("Игорь", true, 8);
        System.out.println("Домашнее задание - СПИСОК");
        Mechanic mechanicIvan = new Mechanic("Иван Иванов", "Компания 1");
        Mechanic mechanicPavel = new Mechanic("Павел Павлов", "Компания 2");
        Mechanic mechanicIgor = new Mechanic("Игорь Игорев", "Компания 3");
        List<String> listMechanics = new ArrayList<>();
        listMechanics.add(String.valueOf(mechanicIvan));
        listMechanics.add(String.valueOf(mechanicPavel));
        listMechanics.add(String.valueOf(mechanicIgor));
        System.out.println(listMechanics);
        Car car1 = new Car("Lada", "Granta", 1.8D, DriverB,SEDAN, List.of(mechanicIvan));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0D, DriverB, SEDAN, List.of(mechanicPavel));
        Car car3 = new Car("BMW", "Z8",3.0D, DriverB, SEDAN, List.of(mechanicIgor));
        Car car4 = new Car("Kia", "Sportage 4", 2.4D, DriverB, CROSSOVER, List.of(mechanicIvan));

        Bus bus1 = new Bus("Нефаз", "Городской", 4.0, DriverD, BIG, List.of(mechanicIvan));
        Bus bus2 = new Bus("Белфаз", "Первый", 4.3, DriverD, SMALL, List.of(mechanicPavel));
        Bus bus3 = new Bus("Икарус", "Второй", 4.2, DriverD, VERY_BIG, List.of(mechanicIgor));
        Bus bus4 = new Bus("Москвич", "Третий", 4.5, DriverD, MIDDLE, List.of(mechanicIvan));

        Truck truck1 = new Truck("Камаз", "Первый", 5.0, DriverC,N1, List.of(mechanicIvan));
        Truck truck2 = new Truck("Камаз", "Второй", 5.5, DriverC, N2, List.of(mechanicPavel));
        Truck truck3 = new Truck("Камаз", "Третий", 5.8, DriverC, N3, List.of(mechanicIgor));
        Truck truck4 = new Truck("Камаз", "Четвертый", 5.2, DriverC, N3, List.of(mechanicIvan));
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
        System.out.println(car2);
        System.out.println();
        System.out.println(bus1);
        System.out.println();
        System.out.println(truck1);
        System.out.println();

        List<Transport> listTr = new ArrayList<>();
        listTr.add(car1);
        listTr.add(car2);
        listTr.add(car3);
        listTr.add(car4);
        listTr.add(bus1);
        listTr.add(bus2);
        listTr.add(bus3);
        listTr.add(bus4);
        listTr.add(truck1);
        listTr.add(truck2);
        listTr.add(truck3);
        listTr.add(truck4);
        System.out.println(listTr);
        System.out.println("водителя авто зовут: " + car1.getDriver()); // как зовут водителя авто;

        System.out.println("у авто есть механики: " + car1.getListMechanics());//какие механики есть у автомобиля.
        List<Transport> racers = new ArrayList<>();
        racers.add(car1);
        racers.add(car2);
        racers.add(car3);
        racers.add(car4);
        racers.add(bus1);
        racers.add(bus2);
        racers.add(bus3);
        racers.add(bus4);
        racers.add(truck1);
        racers.add(truck2);
        racers.add(truck3);
        racers.add(truck4);

        mechanicIvan.doService(car1);
        mechanicIvan.doService(bus1);
        mechanicPavel.doService(truck1);
        mechanicIgor.fixCar(bus1);

        System.out.println("Задание 2");
        Queue<Transport> transportToServiceStation = new ArrayDeque<>();
        ServiceStation service = new ServiceStation(transportToServiceStation);
        for (Transport transport : racers) {
            service.addCarToQueue(transport);
        }
        for (int i = 0; i < transportToServiceStation.size(); i++) {
            service.makeTechService(transportToServiceStation);
        }

        System.out.println("Домашнее задание MAP");

        Map<Transport, List<Mechanic>> testMap = new HashMap<>();
        testMap.put(car1, car1.getListMechanics());
        testMap.put(car2, car2.getListMechanics());
        testMap.put(car3, car3.getListMechanics());
        testMap.put(car4, car4.getListMechanics());
        testMap.put(bus1, bus1.getListMechanics());
        testMap.put(bus2, bus2.getListMechanics());
        testMap.put(bus3, bus3.getListMechanics());
        testMap.put(bus4, bus4.getListMechanics());
        testMap.put(truck1, truck1.getListMechanics());
        testMap.put(truck2, truck2.getListMechanics());
        testMap.put(truck3, truck3.getListMechanics());
        testMap.put(truck4, truck4.getListMechanics());
        for (Map.Entry<Transport, List<Mechanic>> testPrint : testMap.entrySet()) {
            System.out.println("Авто: " + testPrint.getKey() + ", механик: " + testPrint.getValue());
        }
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

