package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcards {
    public static void iterateAnimals(Collection<? extends Animal> animals){
        for (Animal animal: animals) {
            System.out.println("Another step in the cycle completed");
        }
    }

    public static void iterateAnimals2(Collection<? super Cat> animals){
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Another step in the cycle completed");
        }
    }

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());
        pets.add(new Pet());


        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());


        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        iterateAnimals(pets);
        iterateAnimals(dogs);
        iterateAnimals(cats);

        iterateAnimals2(pets);
        iterateAnimals2(cats);
//        iterateAnimals2(dogs); // compile error because Dog is not parent of Cat
    }


}

class Animal {
    public void feed() {
        System.out.println("Animal.feed()");
    }

}

class Pet extends Animal{
    public void call() {
        System.out.println("Pet.call()");
    }
}

class Dog extends Pet{
    public void bark() {
        System.out.println("Dog.bark()");
    }

}


class Cat extends Pet {
    public void meow() {
        System.out.println("Cat.meow()");
    }
}