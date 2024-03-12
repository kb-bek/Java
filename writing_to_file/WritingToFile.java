package work_with_files.writing_to_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test");
        PrintWriter pw = new PrintWriter(file);

        for (int i = 0; i < 3; i++) {
            pw.println("Row " + i);
        }

        pw.close();
    }
}
