package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        /* Without generics - Java 5*/

        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);


        /* With generics */

        List <String> animals2 = new ArrayList<String>();
        animals2.add("lion");
        animals.add("snake");
        animals.add("monkey");

        String animal2 = animals2.get(2);
        System.out.println(animal2);

        /* After Java 7 */

        List <String> list = new ArrayList<>();
    }
}
