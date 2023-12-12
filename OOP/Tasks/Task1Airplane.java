package OOP.Tasks;

public class Task1Airplane {

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();

        airplane1.brand = "Boeing";
        airplane1.model = "737";
        airplane1.year = 1967;
        airplane1.maxSpeed = 521;

        airplane1.getInfo();

        System.out.println(airplane1.fly(3400));
        System.out.println(airplane1.takeOff());
        System.out.println(airplane1.land());
    }
}


class Airplane {

    String brand;
    String model;
    int year;
    int maxSpeed;
    int odometer;
    boolean isFlying = false;

    void getInfo() {
        System.out.println("Brand: " + brand + "\n" +
                            "Model: " + model + "\n" +
                            "Built year: " + year + "\n" +
                            "Max speed: " + maxSpeed + " mph");
    }

    String takeOff(){
        System.out.println("Airplane is taking off");
        isFlying = true;

        return "Is Airplane flying: " + isFlying;
    }

    String fly(int distance){
        System.out.println("Airplane is flying");
        this.odometer = distance;
        return "Mileage: " + odometer;
    }


    String land(){
        System.out.println("Airplane is landing");
        isFlying = false;

        return "Is Airplane flying: " + isFlying;
    }

}
