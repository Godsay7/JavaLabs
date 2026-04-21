import java.util.List;
import java.util.ArrayList;

public class Notepad {
    private String ownerName;
    private List<DateRecord> records;

    public Notepad(String ownerName) {
        this.ownerName = ownerName;
        this.records = new ArrayList<>();
    }

    public class DateRecord{
        private String date;
        private String description;

        public DateRecord(String date, String description) {
            this.date = date;
            this.description = description;
        }

        public void printInfo() {
            // Внутрішній клас має прямий доступ до поля ownerName зовнішнього класу
            System.out.println("Запис з блокнота користувача: " + ownerName);
            System.out.println("Дата: " + date + " | Подія: " + description);
        }
    }

    public void addRecord(String date, String description) {
        DateRecord newRecord = this.new DateRecord(date, description);
        records.add(newRecord);
    }

    public void printAll() {
        System.out.println("Всі записи в блокноті");
        for (DateRecord r : records) {
            r.printInfo();
        }
    }
}