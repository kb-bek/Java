package reading_from_file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = "text";
        File file = new File("D:\\JavaTasks\\src\\reading_from_file\\text");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersStrArr = line.split(" ");
        int[] numbers = new int[numbersStrArr.length];
        int counter = 0;

        for (String numStr : numbersStrArr) {
            numbers[counter++] = Integer.parseInt(numStr);
        }

        System.out.println(Arrays.toString(numbers));
    }

}
