package transport;

public class Car extends Transport {
//    private Key key;
//    private double engineVolume;
//    private String transmission;
//    private final String body;
//    private String registrationNumber;
//    private final int numberOfSeats;
//    boolean summerTires;
//        public static class Key {
//            private final boolean remoteEngineStart;
//            private final boolean keylessAccess;
//            public Key(boolean remoteEngineStart, boolean keylessAccess) {
//                this.remoteEngineStart = remoteEngineStart;
//                this.keylessAccess = keylessAccess;
//            }
//            @Override
//            public String toString() {
//                return (remoteEngineStart ? "удаленный запуск есть":"удаленного запуска нет") +
//                        ", " + (keylessAccess ? "бесключевой доступ есть":"бесключевого доступа нет");
//            }
//        }
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

//        public Car(String brand, String model, int year, String color, String country,
//                   double engineVolume, String transmission, String body, String registrationNumber,
//                   int numberOfSeats, boolean summerTires, Key key, int maxSpeed) {
//            super(brand, model, year, country, color, maxSpeed);
//            setEngineVolume(engineVolume);
//            setTransmission(transmission);
//            if (body == null || body.isBlank() || body.isEmpty()) {
//                this.body = "default";} else this.body = body;
//            setRegistrationNumber(registrationNumber);
//            if (numberOfSeats < 2) {
//                this.numberOfSeats = 2;} else this.numberOfSeats = numberOfSeats;
//            this.summerTires = summerTires;
//            setKey(key);
        }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }

    //Метод сменить шины:
//        public void ChangeTiresForSeasonal(int month) {
//            if (month>=1 && month<=4 || month>=11 && month<=12) {
//                summerTires = false;
//            }
//            if (month >= 5 && month <= 10) {
//                summerTires = true;
//            }
//        }
    @Override
    public String toString() {
    return "Марка: " + getBrand() +
                ", модель: " + getModel()
//                ", год выпуска: " + getYear() +
//                ", страна сборки: " + getCountry() +
//                ", цвет кузова: " + getColor() +
//                ", объем двигателя: " + engineVolume +
//                ", коробка передач: " + transmission +
//                ", тип кузова: " + body +
//                ", регистрационный номер: " + registrationNumber +
//                ", количество мест: " + numberOfSeats +
//                ", тип резины: " + (summerTires ? "летняя":"зимняя")
//                + ", " + key +
//                ", максимальная скорость: " + getMaxSpeed() + "."
            ;
        }


//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public boolean isSummerTires() {
//        return summerTires;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume <= 0) {
//            this.engineVolume = 1.5;
//        } else this.engineVolume = engineVolume;
//    }
//
//    public void setTransmission(String transmission) {
//        if (transmission == null || transmission.isBlank() || transmission.isEmpty()){
//            this.transmission = "default";} else this.transmission = transmission;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
//            this.registrationNumber = "A111AA111";} else this.registrationNumber = registrationNumber;
//    }
//
//    public void setSummerTires(boolean summerTires) {
//            this.summerTires = summerTires;
//        }
//
//    public Key getKey() {
//        return key;
//    }

//    public void setKey(Key key) {
//        if (key != null) {
//            this.key = key;
//        } else key = new Key(false, false);
//    }
}