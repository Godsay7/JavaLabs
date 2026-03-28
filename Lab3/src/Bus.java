import java.util.Scanner;

public class Bus {
    private String name;
    private String surname;
    private String busNumber;
    private int routeNumber;
    private String brand;
    private int yearOfStart;
    private int mileage;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(String number) {
        this.busNumber = number;
    }
    public int getRoutNumber() {
        return routeNumber;
    }
    public void setRoutNumber(int number) {
        if (number > 0) {
            this.routeNumber = number;
        }
        else {
            System.out.println("Rout number can't be negative value");
        }
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYearOfStart() {
        return yearOfStart;
    }
    public void setYearOfStart(int number) {
        if (number >= 0 && number < 50) {
            this.yearOfStart = number;
        }
        else {
            System.out.println("Bus can't be that old");
        }
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int km) {
        if (km > 0) {
            this.mileage = km;
        }
        else {
            System.out.println("Mileage can't be negative");
        }
    }

    Bus() {
        name = "John";
        surname = "Marston";
        busNumber = "0000";
        routeNumber = 0;
        brand = "Volkswagen";
        yearOfStart = 2010;
        mileage = 10000;
    }

    Bus(String Name, String Surname, String BusNumber, int RoutNumber, String Brand, int Year, int Mileage) {
        name = Name;
        surname = Surname;
        busNumber = BusNumber;
        routeNumber = RoutNumber;
        brand = Brand;
        yearOfStart = Year;
        mileage = Mileage;
    }

    public void AddBus() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Введіть ім'я машиніста: ");
            input = scanner.nextLine().trim();
            if (input.matches("^[a-zA-Zа-яА-ЯіІїЇєЄґҐ'\\-]+$")) {
                this.name = input;
                break;
            } else {
                System.out.println("Помилка! Ім'я повинно містити лише літери.");
            }
        }

        while (true) {
            System.out.println("Введіть прізвище машиніста: ");
            input = scanner.nextLine().trim();
            if (input.matches("^[a-zA-Zа-яА-ЯіІїЇєЄґҐ'\\-]+$")) {
                this.surname = input;
                break;
            } else {
                System.out.println("Помилка! Прізвище повинно містити лише літери.");
            }
        }

        while (true) {
            System.out.println("Введіть номер автобуса (4 цифри): ");
            input = scanner.nextLine().trim();
            if (input.matches("^\\d{4}$")) {
                this.busNumber = input;
                break;
            } else {
                System.out.println("Помилка! Номер автобуса має складатися рівно з 4 цифр.");
            }
        }

        while (true) {
            System.out.println("Введіть марку автобуса: ");
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                this.brand = input;
                break;
            } else {
                System.out.println("Помилка! Марка автобуса не може бути порожньою.");
            }
        }

        while (true) {
            System.out.println("Введіть номер маршруту, яким буде їздити автобус: ");
            try {
                this.routeNumber = Integer.parseInt(scanner.nextLine().trim());
                if (this.routeNumber > 0) {
                    break;
                } else {
                    System.out.println("Помилка! Номер маршруту має бути більшим за 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Будь ласка, введіть ціле число (цифри).");
            }
        }

        while (true) {
            System.out.println("Введіть скільки років автобус в експлуатації: ");
            try {
                this.yearOfStart = Integer.parseInt(scanner.nextLine().trim());
                if (this.yearOfStart >= 0 && this.yearOfStart <= 50 ) {
                    break;
                } else {
                    System.out.println("Помилка! Кількість років не може бути від'ємною або більшою 50.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть ціле число.");
            }
        }

        while (true) {
            System.out.println("Вкажіть пробіг автобуса в км: ");
            try {
                this.mileage = Integer.parseInt(scanner.nextLine().trim());
                if (this.mileage >= 0) {
                    break;
                } else {
                    System.out.println("Помилка! Пробіг не може бути від'ємним.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть ціле число.");
            }
        }
        this.displayBus();
    }
    public void displayBus() {
        String color = "\u001B[35m";
        String reset = "\u001B[0m";
        System.out.println(color + "Name: " + reset + this.name + ", " + color + "surname: " + reset + this.surname + ", " + color + "bus number: " + reset +
                this.busNumber + ", " + color + "brand of bus: " + reset + this.brand + ", " + color + "route number: " + reset + this.routeNumber + ", " +
                color + "year of start: " + reset + this.yearOfStart + ", " + color + "mileage: " + reset + this.mileage);
    }
}