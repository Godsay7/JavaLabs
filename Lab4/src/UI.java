import java.util.Objects;
import java.util.Scanner;

public class UI {
    public static String InFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full path to the input text file:");
        String path = scanner.nextLine();
        if (path.matches("^[a-zA-z]:\\\\.*")) {
                return path;
        }
        else {
                System.out.println("This text don't look like file path" +
                        "(or see if you have a drive with that letter), try again");
                return UI.InFileName();
        }
    }

    public static String OutFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full path to the output text file:");
        String path = scanner.nextLine();
        if (path.matches("^[a-zA-z]:\\\\.*")) {
            return path;
        }
        else {
            System.out.println("This text don't look like file path" +
                    "(or see if you have a drive with that letter), try again");
            return UI.OutFileName();
        }
    }
}
