package transport;

public class DriverD extends Driver {
    public DriverD(String name, boolean availableDriverLicense, int experienceYear) {
        super(name, availableDriverLicense, experienceYear);
    }

    @Override
    public void startMoving() {
        System.out.println("водитель категории D " + getName() + " начинает двигаться");
    }

    @Override
    public void finishMoving() {
        System.out.println("водитель категории D " + getName() + " заканчивает двигаться");
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории D " + getName() + " заправляет автомобиль");
    }
}
