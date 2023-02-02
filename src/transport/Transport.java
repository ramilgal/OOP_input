package transport;

public abstract class Transport <T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public abstract void startMoving();
    public abstract void finishMoving();

    public abstract void printType();

    abstract void passDiagnostic() throws TransportTypeException;

    public abstract Type getType();

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " +
                engineVolume + driver;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }
}
