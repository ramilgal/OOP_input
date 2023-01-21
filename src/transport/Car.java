package transport;

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
    boolean summerTires;
        public static class Key {
            private final boolean remoteEngineStart;
            private final boolean keylessAccess;
            public Key(boolean remoteEngineStart, boolean keylessAccess) {
                this.remoteEngineStart = remoteEngineStart;
                this.keylessAccess = keylessAccess;
            }
            @Override
            public String toString() {
                return (remoteEngineStart ? "удаленный запуск есть":"удаленного запуска нет") +
                        ", " + (keylessAccess ? "бесключевой доступ есть":"бесключевого доступа нет");
            }
        }

        public Car(String brand, String model, int year, String country, String color, double engineVolume,
               String transmission, String body, String registrationNumber, int numberOfSeats,
                   boolean summerTires, Key key) {
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
            setEngineVolume(engineVolume);
            setTransmission(transmission);
            if (body == null || body.isBlank() || body.isEmpty()) {
                this.body = "default";} else this.body = body;
            setRegistrationNumber(registrationNumber);
            if (numberOfSeats < 2) {
                this.numberOfSeats = 2;} else this.numberOfSeats = numberOfSeats;
            this.summerTires = summerTires;
            setKey(key);
        }
    //Метод сменить шины:
        public void ChangeTiresForSeasonal(int month) {
            if (month>=1 && month<=4 || month>=11 && month<=12) {
                summerTires = false;
            }
            if (month >= 5 && month <= 10) {
                summerTires = true;
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
                ", тип резины: " + (summerTires ? "летняя":"зимняя")
                + ", " + key;
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

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;}
            else this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";} else this.color = color;
        }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()){
            this.transmission = "default";} else this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "A111AA111";} else this.registrationNumber = registrationNumber;
    }

    public void setSummerTires(boolean summerTires) {
            this.summerTires = summerTires;
        }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key != null) {
            this.key = key;
        } else key = new Key(false, false);
    }
}