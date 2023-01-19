package transport;
import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private Key key;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String body;
    private String registrationNumber;
    private final int numberOfSeats;
    boolean summerTiresOrWinterTires;
        public static class Key {
            private final boolean remoteEngineStart;
            private final boolean keylessAccess;
            public Key(boolean remoteEngineStart, boolean keylessAccess) {
                this.remoteEngineStart = remoteEngineStart;
                this.keylessAccess = keylessAccess;
            }
            @Override
            public String toString() {
                return "удаленный запуск двигателя: " + remoteEngineStart +
                        ", бесключевой доступ: " + keylessAccess;
            }
        }

        public Car(String brand, String model, int year, String country, String color, double engineVolume,
               String transmission, String body, String registrationNumber, int numberOfSeats,
                   boolean summerTiresOrWinterTires, Key key) {
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
            if (color == null || color.isEmpty() || color.isBlank()) {
                this.color = "белый";} else this.color = color;
            if (engineVolume <= 0) {
                this.engineVolume = 1.5;} else this.engineVolume = engineVolume;
            if (transmission == null || transmission.isBlank() || transmission.isEmpty()){
                this.transmission = "default";} else this.transmission = transmission;
            if (body == null || body.isBlank() || body.isEmpty()) {
                this.body = "default";} else this.body = body;
            if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
                this.registrationNumber = "default";} else this.registrationNumber = registrationNumber;
            if (numberOfSeats < 2) {
                this.numberOfSeats = 2;} else this.numberOfSeats = numberOfSeats;
            this.summerTiresOrWinterTires = summerTiresOrWinterTires;

            if (key != null) {
                this.key = key;}
        }
    //Метод сменить шины:
        public void ChangeTiresForSeasonal(int month) {
        switch (month) {
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
                summerTiresOrWinterTires = false;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                summerTiresOrWinterTires = true;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
    @Override
    public String toString() {
        return "Марка: " + brand +
                ", модель: " + model +
                ", год выпуска: " + year +
                ", страна сборки: " + country +
                ", цвет кузова: " + color +
                ", объем двигателя: " + engineVolume +
                ", коробка передач: " + transmission +
                ", тип кузова: " + body +
                ", регистрационный номер: " + registrationNumber +
                ", количество мест: " + numberOfSeats +
                ", тип резины: " + summerTiresOrWinterTires +
                ", " + key;
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

    public String getTransmission() {
        return transmission;
    }

    public String getBody() {
        return body;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTiresOrWinterTires() {
        return summerTiresOrWinterTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerTiresOrWinterTires(boolean summerTiresOrWinterTires) {
        this.summerTiresOrWinterTires = summerTiresOrWinterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
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