package transport;

import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean availableDriverLicense;
    private int experienceYear;

    public Driver(String name, boolean availableDriverLicense, int experienceYear) {
        this.name = name;
        this.availableDriverLicense = availableDriverLicense;
        this.experienceYear = experienceYear;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void refuelCar();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailableDriverLicense() {
        return availableDriverLicense;
    }

    public void setAvailableDriverLicense(boolean availableDriverLicense) {
        this.availableDriverLicense = availableDriverLicense;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    @Override
    public String toString() {
        return ", водитель: " + name +
                ", водительские права: " + availableDriverLicense +
                ", стаж вождения: " + experienceYear + " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return availableDriverLicense == driver.availableDriverLicense && experienceYear == driver.experienceYear && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, availableDriverLicense, experienceYear);
    }
}
