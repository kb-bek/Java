// Automobile классынын мураскор Car классы
public class Car extends Automobile {
    // Класстын талаасы
    private int maxPersons;

    // Биринчи конструктор
    public Car() {}

    // Экинчи конструктор
    public Car(String color, int maxWeight, int year, int maxPersons) {
        super(color, maxWeight, year);
        this.maxPersons = maxPersons;
    }

    // Геттер жана сеттер методдор

    public int getMaxPersons() {
        return maxPersons;
    }

    public void setMaxPersons(int maxPersons) {
        this.maxPersons = maxPersons;
    }

    // Automobile классынын move методун кайра аныктоо - Override
    @Override
    public void move(String destination) {
        System.out.println("Машинанын багыты - " + destination);
    }
}
