package OOP;

public class Interfaces {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.breathe();
        Animal.showCategory();

    }
}

class Dog implements Animal {
    public void makeSound(){
        System.out.println("Woof!");
    }
}


