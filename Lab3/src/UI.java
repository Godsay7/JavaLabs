import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public static ArrayList<Bus> defineRoute(ArrayList<Bus> listOfBus) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер маршруту за яким ви хочете переглянути наявні автобуси: ");
        int value = scanner.nextInt();
        ArrayList<Bus> newListOfBus = new ArrayList<Bus>();
        for (int i = 0; i < listOfBus.size(); i++) {
            if (listOfBus.get(i).getRoutNumber() == value) {
                newListOfBus.add(listOfBus.get(i));
            }
        }
        for (Bus bus : newListOfBus) {
            bus.displayBus();
        }
        return newListOfBus;
    }

    public static ArrayList<Bus> defineYear(ArrayList<Bus> listOfBus) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення, яке відповідатиме кількості років в експлуаатації автобусу: ");
        int value = scanner.nextInt();
        ArrayList<Bus> newListOfBus = new ArrayList<Bus>();
        for (int i = 0; i < listOfBus.size(); i++) {
            if (listOfBus.get(i).getYearOfStart() >= value) {
                newListOfBus.add(listOfBus.get(i));
            }
        }
        for (Bus bus : newListOfBus) {
            bus.displayBus();
        }
        return newListOfBus;
    }

    public static ArrayList<Bus> defineMileage(ArrayList<Bus> listOfBus) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення, кілометражу за яким ви хочете відсортувати автобуси: ");
        int value = scanner.nextInt();
        ArrayList<Bus> newListOfBus = new ArrayList<Bus>();
        for (int i = 0; i < listOfBus.size(); i++) {
            if (listOfBus.get(i).getMileage() >= value) {
                newListOfBus.add(listOfBus.get(i));
            }
        }
        for (Bus bus : newListOfBus) {
            bus.displayBus();
        }
        return newListOfBus;
    }
}