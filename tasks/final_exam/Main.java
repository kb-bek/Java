
public class Main {
    public static void main(String[] args) {
        Automobile automobile1 = new Automobile();
        Car car1 = new Car();
        Truck truck1 = new Truck();
        automobile1.setColor("Кара");
        automobile1.setMaxWeight(2000);
        automobile1.setYear(2014);

        car1.setColor("Боз");
        car1.setMaxWeight(500);
        car1.setYear(2020);
        car1.setMaxPersons(5);

        truck1.setColor("Кок");
        truck1.setMaxWeight(10000);
        truck1.setYear(2022);
        truck1.setPurpose("Кум ташуучу");


        System.out.println("*** Automobile объекти ***");
        System.out.println("Унаанын тусу - " + automobile1.getColor() + "\n" +
                "Максималдуу жук - " + automobile1.getMaxWeight() + "кг\n" +
                "Унаанын ондурулгон жылы - " + automobile1.getYear()
                );
        automobile1.start();
        automobile1.move("Жалал-Абад");
        automobile1.move("Талас", 550);
        automobile1.stop();
        System.out.println();

        System.out.println("*** Car классынын объекти ***");
        System.out.println("Унаанын тусу - " + car1.getColor() + "\n" +
                "Максималдуу жук - " + car1.getMaxWeight() + "кг\n" +
                "Унаанын ондурулгон жылы - " + car1.getYear() + "\n" +
                "Максималдуу орун - " + car1.getMaxPersons()
         );

        car1.start();
        car1.move("Кыргыз-Турк Манас Университети");
        car1.stop();
        System.out.println();


        System.out.println("*** Truck классынын объекти ***");
        System.out.println("Унаанын тусу - " + truck1.getColor() + "\n" +
                "Максималдуу жук - " + truck1.getMaxWeight() + "кг\n" +
                "Унаанын ондурулгон жылы - " + truck1.getYear() + "\n" +
                "Трак туру - " + truck1.getPurpose()
        );

        truck1.start();
        truck1.move("Сан-Франциско");
        truck1.stop();

    }
}