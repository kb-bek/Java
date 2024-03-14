package serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        /*

        // Writing objects to file

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "Sam");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */


        /*

        // Writing array of objects to file. First Way

        Person[] people = {new Person(1, "Richard"), new Person(2, "Bob"),
                new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for (Person person: people) {
                oos.writeObject(person);
            }

            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */

        /*

        // Writing array of objects to file. Second Way

        Person[] people = {new Person(1, "Richard"), new Person(2, "Bob"),
                new Person(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */


        //try with resources

        Person person1 = new Person(4, "Tony");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            oos.writeObject(person1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
