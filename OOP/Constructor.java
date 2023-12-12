package OOP;

public class Constructor {
    public static void main(String[] args) {

        Car car1 = new Car("Lamborghini", "Sian", 217);
        car1.getInfo();

    }
}


class Car {
    String brand;
    String model;
    int maxSpeed;

    public Car(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void getInfo(){
        System.out.println("Brand: " + brand + "\n" +
                            "Model: " + model + "\n" +
                            "Max speed: " + maxSpeed + " mph"
                );
    }
}
