import java.util.Scanner;

public class Reader {
    static Scanner input = new Scanner(System.in);

    public static String getInput() {
        return input.nextLine().toLowerCase();
    }
}
