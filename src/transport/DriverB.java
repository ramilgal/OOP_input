package transport;

public class DriverB extends Driver {
    public DriverB(String name, boolean availableDriverLicense, int experienceYear) {
        super(name, availableDriverLicense, experienceYear);
    }

    @Override
    public void startMoving() {
        System.out.println("водитель категории В " + getName() + " начинает двигаться");
    }

    @Override
    public void finishMoving() {
        System.out.println("водитель категории В " + getName() + " заканчивает двигаться");
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории В " + getName() + " заправляет автомобиль");
    }
}
