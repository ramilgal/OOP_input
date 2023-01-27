package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    ///private final int year;
    ///private final String country;
    ///private String color;
    //private int maxSpeed;

    public Transport(String brand, String model, double engineVolume) {
//                      int year, String color, String country, int maxSpeed) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else this.brand = brand;
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else this.model = model;
        setEngineVolume(engineVolume);
//        if (year <= 0) {
//            this.year = 2000;
//        } else this.year = year;
//        if (country == null || country.isBlank() || country.isEmpty()) {
//            this.country = "default";
//        } else this.country = country;
//        setColor(color);
//        setMaxSpeed(maxSpeed);
        }

    public abstract void startMoving();
    public abstract void finishMoving();

    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model;
//                ", год выпуска: " + year +
//                ", страна сборки: " + country +
//                ", цвет кузова: " + color +
//                ", максимальная скорость: " + maxSpeed;
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

    //    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isEmpty() || color.isBlank()) {
//            this.color = "default";} else this.color = color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }

//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed <= 0) {
//            this.maxSpeed = 1;
//        } else this.maxSpeed = maxSpeed;
//    }
}
