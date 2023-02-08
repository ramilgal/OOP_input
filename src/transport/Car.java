package transport;

import java.util.List;

public class Car extends Transport <DriverB> {
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        setBodyType(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль закончил движение");
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else { System.out.println(getBodyType());}
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автомобиля");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Лучшее время круга у автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля");
    }

    @Override
    public String toString() {
    return "Тип средства: " + getType() +
            ", марка: " + getBrand() +
                ", модель: " + getModel() +
            ", " + bodyType
            //+ ", механик:" + getListMechanics();
        ;}
    @Override
    public boolean passDiagnostic() {
        System.out.println("Легковой автомобиль " + getModel() + " " + getBrand() + " может проходить диагностику");
        return false;
    }

}