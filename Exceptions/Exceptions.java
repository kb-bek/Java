package Exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = scanner.nextInt();

            if(num != 0) {
                throw new ScannerException("the user entered something other than zero");
            }
        }
    }
}
