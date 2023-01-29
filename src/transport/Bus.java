package transport;

public class Bus extends Transport <DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
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
}
