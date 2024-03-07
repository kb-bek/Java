package inner_classes;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        Electrocar.Battery battery = new Electrocar.Battery();

        electrocar.start();

        battery.charge();
    }
}
