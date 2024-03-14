package enumerate;

public enum Season {

    SUMMER(25), AUTUMN(10), WINTER(-23), SPRING(15);

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}
