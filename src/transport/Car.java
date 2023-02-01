package transport;

public class Car extends Transport <DriverB> implements Competing {
    private BodyType bodyType;
    enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        JEEP("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        WAGON("Фургон"),
        MINIVAN("Минивэн");
        private String type;
        BodyType(String type) {
        this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }


        @Override
        public String toString() {
            return "тип кузова: " + type;
        }
    }

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        setBodyType(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль закончил движение");
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else { System.out.println(getBodyType());}
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автомобиля");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Лучшее время круга у автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля");
    }

    @Override
    public String toString() {
    return "Марка: " + getBrand() +
                ", модель: " + getModel() +
            ", " + bodyType;
        }

}