package transport;

public class Truck extends Transport <DriverC> {
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        setLoadCapacity(loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public static LoadCapacity getValue(double value) {
        for (LoadCapacity i : LoadCapacity.values()) {
            if (value >= i.getMin() && value<= i.getMax()) {
                System.out.println(i);
                return i;
            }
        }
        return null;
    }
    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else { System.out.println(getLoadCapacity());}
    }

    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для грузовика");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Лучшее время круга у грузовика");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика");
    }
    @Override
    public String toString() {
        return "Тип средства: " + getType() +
                ", грузоподъемность: " +
                "от " + loadCapacity.getMin() +
                " до " + loadCapacity.getMax() +
                " тонн";
    }
    @Override
    public boolean passDiagnostic() {
        System.out.println("Грузовик " + getModel() + " " + getBrand() + " может проходить диагностику");
        return false;
    }
}
