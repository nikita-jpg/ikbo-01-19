import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        try(FileWriter writer = new FileWriter(".\\text.txt", false)) {
            writer.write("");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter writer = new FileWriter(".\\text.txt", true)) {
            String inputString;
            inputString = in.nextLine();
            writer.write(inputString);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
