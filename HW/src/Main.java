void main() {
    NumberPrinter task1 = new NumberPrinter("1", 1000);
    NumberPrinter task2 = new NumberPrinter("2", 2000);
    NumberPrinter task3 = new NumberPrinter("3", 3000);

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);
    Thread thread3 = new Thread(task3);

    thread1.start();
    thread2.start();
    thread3.start();
}