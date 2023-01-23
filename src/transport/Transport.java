package transport;

public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String color, String country, int maxSpeed) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;
        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "default";
        } else this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
        }

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", год выпуска: " + year +
                ", страна сборки: " + country +
                ", цвет кузова: " + color +
                ", максимальная скорость: " + maxSpeed;
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

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "default";} else this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 1;
        } else this.maxSpeed = maxSpeed;
    }
}
