import java.util.Scanner;

public class Scan {
    public static void scanNum(int[][] Arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                while (true) {
                    System.out.print("Введіть ціле число A[" + i + "][" + j + "] = ");
                    if (scanner.hasNextInt()) {
                        Arr[i][j] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Помилка! Введіть ціле число.");
                        scanner.next();
                    }
                }
            }
        }
    }
}