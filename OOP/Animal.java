package OOP;

public interface Animal {
    String Category = "Animal";

    void makeSound();

    static void showCategory() {
        System.out.println("Category: " + Category);
    }

    default void breathe() {
        System.out.println("I can breathe");
    }
}
