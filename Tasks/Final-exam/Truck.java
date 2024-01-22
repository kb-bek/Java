// Automobile классынын мураскор Truck классы
public class Truck extends Automobile{

    // Класстын талаасы
    private String purpose;

    // Биринчи конструктор
    public Truck() {}

    // Экинчи конструктор
    public Truck(String color, int maxWeight, int year, String purpose) {
        super(color, maxWeight, year);
        this.purpose = purpose;
    }

    // Геттер жана сеттер методдор
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    // Automobile классынын move методун кайра аныктоо - Override
    @Override
    public void move(String destination) {
        System.out.println("Трактын багыты - " + destination);
    }

}

