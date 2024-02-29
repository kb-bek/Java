package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {

        /*
            Checked Exceptions (Compile time exceptions)
            Unchecked Exceptions (Runtime exceptions)
        */

        // Checked exceptions

        File file = new File("file");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Unchecked exceptions

        int num = 4 / 0;  // Exception divide by zero;

        String str = null;
        str.length(); // NullPointerException


    }
}
