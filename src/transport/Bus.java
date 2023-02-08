package transport;

import java.util.List;

public class Bus extends Transport <DriverD> {
    private Capacity capacity;


    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        setCapacity(capacity);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else { System.out.println(getCapacity());}
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автобуса");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Лучшее время круга у автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса");
    }
    @Override
    public String toString() {
        return "Тип средства: " + getType() +
                ", вместимость: " + capacity.getMin() +
                " - " + capacity.getMax();
    }
    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобус не может проходить диагностику");
    }
//    @Override
//    public boolean passDiagnostic() {
//        try {
//            throw new TransportTypeException("Автобус "+ getBrand() + " не должен проходить диагностику");
//        }
//        catch (TransportTypeException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println();
//            //System.out.println("Диагностика завершена");
//        }
//        return false;
//    }



}
