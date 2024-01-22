public class Automobile {

    // Класстын талаалары
    private String color;
    private int maxWeight;
    private int year;


    // Биринчи конструктор
    public Automobile() {}

    // Экинчи конструктор
    public Automobile(String color, int maxWeight, int year) {
        this.color = color;
        this.maxWeight = maxWeight;
        this.year = year;
    }

    // Геттер жана сеттер методдор

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Кошумча Automobile классынын start методу: Унааны от алдырат
    public void start() {
        System.out.println("Унаа от алды");
    }

    // Кошумча Automobile классынын start методу: Унааны токтотот
    public void stop() {
        System.out.println("Унаа токтоду");
    }

    // Automobile классынын move методу: Унаанын багытын корсотот
    public void move(String destination) {
        System.out.println("Багыт - " + destination);
    }

    // move методун Overloading
    public void move(String destination, int distance) {
        System.out.println("Багыт - " + destination + " Аралык - " + distance + "км");
    }


}
