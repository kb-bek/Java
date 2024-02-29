package method_equals;

public class MethodEquals {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1 == animal2);  // false
        System.out.println(animal1.equals(animal2));  // true


    }
}

class Animal {
    private int id;


    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        Animal animalObj = (Animal) obj;
        return this.id == animalObj.id;
    }

}
