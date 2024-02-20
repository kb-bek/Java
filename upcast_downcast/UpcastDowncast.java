package upcast_downcast;

public class UpcastDowncast {
    public static void main(String[] args) {

        Animal[] animalArray = new Animal[4];

        Animal animal1 = new Dog(); // Up-casting
        Animal animal2 = new Cat(); // Up-casting
        animalArray[0] = animal1;
        animalArray[1] = animal2;
        animalArray[2] = new Dog();
        animalArray[3] = new Cat();

        for (Animal element: animalArray) {
            element.eat();

            if(element instanceof Dog) {
                Dog dog = (Dog) element; // Down-casting
                dog.bark();
            } else if (element instanceof Cat) {
                Cat cat = (Cat) element; // Down-casting
                cat.meow();
            }
        }

    }
}


class Animal {
    public void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal{
    public void meow() {
        System.out.println("Meowing");
    }
}