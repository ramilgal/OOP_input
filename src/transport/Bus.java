package transport;

public class Bus extends Transport <DriverD> {
    private Capacity capacity;
    enum Capacity {
        VERYSMALL (0, 10),
        SMALL (11, 25),
        MIDDLE (26, 50),
        BIG (51, 80),
        VERYBIG (81, 120);
        private int min;
        private int max;

        Capacity(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        @Override
        public String toString() {
            return "Вместимость: " + min +
                    " - " + max;
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public static Capacity getValue(int value) {
        for (Capacity i : Capacity.values()) {
            if (value >= i.getMin() && value<= i.getMax()) {
                System.out.println(i);
                return i;
            }
        }
        return null;
    }
    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else { System.out.println(getCapacity());}
    }
    public Bus(String brand, String model, double engineVolume, DriverD driver, int capacity) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автобуса");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Лучшее время круга у автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса");
    }


}
