package serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        /*

        // Reading objects from file

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

         */


        /*

        // Reading array of objects from file. First way

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();

            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++){
               people[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people));

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

         */

        /*

        // Reading array of objects from file. Second way

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

         */

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))){
            Person people = (Person) ois.readObject();
            System.out.println(people);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
