import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);
    int neededValue = 0;
    for (int i = 0; i < 3; i++) {
        while (true) {
            System.out.println("Введіть ваше число з 4 цифр №" + (i + 1) + ":");
            String input = scanner.next();
            if(input.matches("^\\d{4}$")){
                int biggestValue = Integer.parseInt(input);
                if (biggestValue > neededValue) {
                    neededValue = biggestValue;
                }
                break;
            } else {
                System.out.println("Ви ввели неправильні данні, спробйте ще раз");
            }
        }
    }
    scanner.close();
    String strVal = String.valueOf(neededValue);
    char chVal = strVal.charAt(0);
    System.out.print("Ваше значення:" + chVal);
}