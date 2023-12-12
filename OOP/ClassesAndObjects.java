package OOP;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.model = "Lenovo IdeaPad 330";
        laptop1.cpu = "Core i3 7gen";
        laptop1.ram = 8;
        laptop1.disk = 256;
        laptop1.gpu = "Nvidia Geforce mx150";

        laptop1.getCharacteristics();
        laptop1.turnOn();
        laptop1.switchOff();

    }

}

class Laptop {

    String model;
    String cpu;
    int ram;
    int disk;
    String gpu;

    void getCharacteristics() {
        System.out.println(
                        "Model: " + model + "\n" +
                        "CPU: " + cpu + "\n" +
                        "RAM: " + ram + "Gb" + "\n" +
                        "SSD: " + disk + "Gb" + "\n" +
                        "GPU: " + gpu + "\n"
        );
    }

    void turnOn(){
        System.out.println("Laptop: " + model + " is turning on");
    }

    void switchOff(){
        System.out.println("Laptop: " + model + " is switching off");
    }
}
