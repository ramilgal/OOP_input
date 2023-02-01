package transport;

public class Truck extends Transport <DriverC> implements Competing {
    private double loadCapacity;
    enum LoadCapacity {
        N1 (0, 10),
        N2 (3.5F, 12),
        N3 (13, 200);
        private float min;
        private float max;

        LoadCapacity(float min, float max) {
            this.min = min;
            this.max = max;
        }

        public float getMin() {
            return min;
        }

        public float getMax() {
            return max;
        }
        @Override
        public String toString() {
            return "Грузоподъемность: " +
                    "от " + min +
                    " до " + max +
                    " тонн";
        }
    }
    public Truck(String brand, String model, double engineVolume, DriverC driver, double loadCapacity) {
        super(brand, model, engineVolume, driver);
        setLoadCapacity(loadCapacity);
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public static LoadCapacity getValue(double value) {
        for (LoadCapacity i : LoadCapacity.values()) {
            if (value >= i.getMin() && value<= i.getMax()) {
                System.out.println(i);
                return i;
            }
        }
        return null;
    }
    @Override
    public void printType() {
        if (getLoadCapacity() == 0) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else { System.out.println(getLoadCapacity());}
    }
    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для грузовика");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Лучшее время круга у грузовика");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика");
    }

//    @Override
//    public String toString() {
//        return "Грузоподъемность: " +
//                "от " + getMin() +
//                " до " + loadCapacity.getMax() +
//                " тонн";
//    }
}
