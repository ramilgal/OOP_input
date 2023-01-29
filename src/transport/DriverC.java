package transport;

public class DriverC extends Driver {
    public DriverC(String name, boolean availableDriverLicense, int experienceYear) {
        super(name, availableDriverLicense, experienceYear);
    }

    @Override
    public void startMoving() {
        System.out.println("водитель категории C " + getName() + " начинает двигаться");
    }

    @Override
    public void finishMoving() {
        System.out.println("водитель категории C " + getName() + " заканчивает двигаться");
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории C " + getName() + " заправляет автомобиль");
    }
}
