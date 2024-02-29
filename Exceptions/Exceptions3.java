package Exceptions;

import java.io.IOException;
import java.text.ParseException;

public class Exceptions3 {
    public static void main(String[] args) {

        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }
    }

    public static void run() throws IOException, ParseException {

    }
}
