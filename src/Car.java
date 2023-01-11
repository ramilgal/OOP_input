import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        }
        if (country == null || country.equals("")) {
            this.country = "default";
        }
        if (engineVolume <=0) {
            this.engineVolume = 1.5;
        }
        if (color == null || color.equals("")) {
            this.color = "белый";
        }
        if (year <=0) {
            this.year = 2000;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", год выпуска: " + year +
                ", страна сборки: " + country +
                ", цвет кузова: " + color +
                ", объем двигателя: " + engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && country.equals(car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }
}