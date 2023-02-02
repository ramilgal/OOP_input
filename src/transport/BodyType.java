package transport;

public enum BodyType {
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
